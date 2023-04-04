public class StartingRoom extends MapTile{

    public StartingRoom(int x,int y){
        super(x, y);
    }

    public static String intro_text(){
        return "You find yourself in a strange place.\n You look around and realize that there is no one around you.";
    }

    public void modify_player(Player player) {

    }
}
