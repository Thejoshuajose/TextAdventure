import java.awt.Point;
import java.util.ArrayList;

public class MapTile {
    private int x;
    private int y;


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

    public ArrayList<Action> adjacent_moves() {
        ArrayList<Action> moves = new ArrayList<>();
        if(World.tile_exists(x,y+1)!=null)
            moves.add(new MoveEast());
        if(World.tile_exists(x+1,y)!=null)
            moves.add(new MoveSouth());
        if(World.tile_exists(x,y-1)!=null)
            moves.add(new MoveWest());
        if(World.tile_exists(x-1,y-1)!=null)
            moves.add(new MoveNorth());
        return moves;
    }

    public ArrayList<Action> available_actions(){
        ArrayList<Action> moves = new ArrayList<>();
        moves = adjacent_moves();
        moves.add(new ShowInventory());
        return moves;
    }
    public String intro_text() {
        return null;
    }
}
