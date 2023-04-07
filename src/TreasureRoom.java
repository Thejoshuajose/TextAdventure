public class TreasureRoom extends MapTile {
    public TreasureRoom(int x, int y) {
        super(x,y);
    }

    public String intro_text(){
        return "A stack of shiny gold coins has appeared in front of you.\nYou pick them up." +
                "\nYou become 15 coins richer. ";
    }
}
