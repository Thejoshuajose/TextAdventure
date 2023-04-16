import java.util.ArrayList;

public class MapTile {
    private int x;
    private int y;

    private Weapon weapon;


    public int getX(){
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public MapTile(int x,int y){
        this.x = x;
        this.y = y;

    }

    public MapTile(int x,int y,Weapon weapon){
        this.x = x;
        this.y = y;
        this.weapon = weapon;

    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MapTile other = (MapTile) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }
    public ArrayList<Action> adjacent_moves() {
        ArrayList<Action> moves = new ArrayList<>();
        if(World.tile_exists(x,y+1)!=null)
            moves.add(new MoveEast());
        if(World.tile_exists(x+1,y)!=null)
            moves.add(new MoveSouth());
        if(World.tile_exists(x,y-1)!=null)
            moves.add(new MoveWest());
        if(World.tile_exists(x-1,y)!=null)
            moves.add(new MoveNorth());

        return moves;
    }

    public ArrayList<Action> available_actions(){
        ArrayList<Action> moves = new ArrayList<>();
        moves = adjacent_moves();
        moves.add(new RunAway());
        moves.add(new ShowInventory());
        moves.add(new Dodge());
        return moves;
    }
    public String intro_text() {
        return null;
    }


    public void modify_player(Player player) {
    }
}