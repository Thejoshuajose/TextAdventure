public class TreasureRoom extends LootRoom {

    public TreasureRoom(int x, int y, Gold roomGold) {
        super(x, y, roomGold);
    }

    public String intro_text() {
        if (pickedItem == false)
            return String.format("A stack of shiny gold coins has appeared in front of you.\n You pick them up.\n You become 15 coins richer.");
        else
            return "";
    }

}