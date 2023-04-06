import java.awt.Point;
import java.util.ArrayList;

public class MapTile {
    private int x;
    private int y;
    private int MAX_X;
    private int MAX_Y;


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

    public ArrayList<Point> adjacent_moves() {
        return adjacent_moves(0, 0);
    }

    public ArrayList<Point> adjacent_moves(int x, int y) {
        ArrayList<Point> moves = new ArrayList<Point>();
        // check adjacent positions in x direction
        if (x > 0) {
            moves.add(new Point(x - 1, y));
        }
        if (x < MAX_X) {
            moves.add(new Point(x + 1, y));
        }
        // check adjacent positions in y direction
        if (y > 0) {
            moves.add(new Point(x, y - 1));
        }
        if (y < MAX_Y) {
            moves.add(new Point(x, y + 1));
        }
        return moves;
    }

    public String intro_text() {
        return null;
    }
}
