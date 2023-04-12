public class LeaveCaveRoom extends MapTile {
    public LeaveCaveRoom(int x, int y) {
        super(x, y);
    }

    public String intro_text(){
        return "You see a light and run towards it.\nYou found the exit...congrats." +
                "\n Good luck on your future endeavours.";
    }
    public void modify_player(Player player) {
    player.victory = true;
    }
}