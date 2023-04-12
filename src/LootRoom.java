public class LootRoom extends MapTile {

    protected Item item;

    public boolean pickedItem = false;

    public LootRoom(int x, int y, Item item) {
        super(x, y);
        this.item = item;
    }

    public void addLoot(Player the_player) {
        the_player.inventory.add(item);
        pickedItem = true;
    }

    public void modify_player(Player the_player) {
        if (pickedItem == false) {
            addLoot(the_player);
        } else {
            System.out.printf("The item %s is already picked \n", item.name);
        }

    }
}
