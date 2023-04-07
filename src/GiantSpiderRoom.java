public class GiantSpiderRoom extends MapTile{

    public GiantSpiderRoom(int x, int y) {
        super(x,y);
    }

    public String intro_text(){
        return "You hear a loud hissing sound.\nA giant spider shoots you with its web." +
                "\nYou take 7 damage. ";
    }
}
