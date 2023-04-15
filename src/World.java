import java.awt.Point;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class World {
    public static String[][] _world;

    static Point Starting_Position = new Point(0,0);
    public static ArrayList<MapTile> history = new ArrayList<>();

    public void load_tiles(){
        List<String> rows = new ArrayList<>();
        try{
            BufferedReader f = new BufferedReader(new FileReader("src/map.txt"));
            String row;
            while ((row = f.readLine()) != null){
                rows.add(row);
            }
            f.close();
            int x_max = rows.get(0).split("\t").length;
            _world = new String[rows.size()][x_max];
            String[] cols;
            String tile_name;
            for (int y = 0; y < rows.size(); y++){
                cols = rows.get(y).split("\t");
                for(int x = 0; x < x_max; x++) {
                    tile_name = cols[x];
                    if (tile_name.equals("StartingRoom")) {
                        Starting_Position.x = y;
                        Starting_Position.y = x;
                    }
                    _world[y][x] = tile_name.equals(" ")?null:tile_name;
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static MapTile tile_exists(int x, int y){
        MapTile mt = null;
//if statement to determine if the room exists
        if((x >= 0 && x < _world.length) && (y>= 0 && y < _world[0].length) && _world[x][y] != null ){
            switch (_world[x][y]){
                case "StartingRoom":
                    mt = new StartingRoom(x,y);
                    mt = checkRoomExists(mt);
                    break;
                case "PixieRoom":
                    mt = new PixieRoom(x,y,new Pixie());
                    mt = checkRoomExists(mt);
                    break;
                case "OgreRoom":
                    mt = new OgreRoom(x,y,new Ogre());
                    mt = checkRoomExists(mt);
                    break;
                case "ZombieRoom":
                    mt = new ZombieRoom(x,y,new Zombie());
                    mt = checkRoomExists(mt);
                    break;
                case "EmptyCavePath":
                    mt = new EmptyCavePathRoom(x,y);
                    mt = checkRoomExists(mt);
                    break;
                case "FindPillowRoom":
                    mt = new FindPillowRoom(x,y,new Pillow());
                    mt = checkRoomExists(mt);
                    break;
                case "TreasureRoom":
                    mt = new TreasureRoom(x,y, new Gold(15));
                    mt = checkRoomExists(mt);
                    break;
                case "DogRoom":
                    mt = new DogRoom(x,y,new Dog());
                    mt = checkRoomExists(mt);
                    break;
                case "GiantSpiderRoom":
                    mt = new GiantSpiderRoom(x,y, new GiantSpider());
                    mt = checkRoomExists(mt);
                    break;
                case "LeaveCaveRoom":
                    mt = new LeaveCaveRoom(x,y);
                    mt = checkRoomExists(mt);
                    break;
                case "FindSwordRoom":
                    mt = new FindSwordRoom(x,y,new Sword());
                    mt = checkRoomExists(mt);
                    break;
                case "FindMaceRoom":
                    mt = new FindMaceRoom(x,y,new Mace());
                    mt = checkRoomExists(mt);
                    break;
                case "FindArrowRoom":
                    mt = new FindArrowRoom(x,y,new Arrow());
                    mt = checkRoomExists(mt);
                    break;
            }
        }
        return mt;
    }

    private static MapTile checkRoomExists(MapTile mt) {
        if(history.indexOf(mt) != -1){
            mt = history.get(history.indexOf(mt));
        }else{
            history.add(mt);
        }
        return mt;
    }
}