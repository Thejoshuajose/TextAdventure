public class EmptyCavePathRoom extends MapTile {
    public EmptyCavePathRoom(int x, int y) {
        super(x,y);
    }
    public String intro_text(){
        return "You look around and see absolutely...nothing.\nThere is only the way forward" +
                "\nYou choose where to go next.";
    }
    public void modify_player(Player player) {

    }
}