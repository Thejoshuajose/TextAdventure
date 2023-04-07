public class StartingRoom extends MapTile{

    public StartingRoom(int x,int y){
        super(x, y);
    }

    public String intro_text(){
        return "You find yourself in a strange place.\nYou look around and realize that there is no one around you.\nYou notice that there are four different directions you can go." +
                "\nYou have something in your pocket. \nWhen you check you notice you have 30 Gold Coins and a stick with a white flag on it. It reads: 'FLEE'.\n There are brick patterned walls lead off into mysterious darkness.";
    }

    public void modify_player(Player player) {

    }
}
