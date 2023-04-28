public class WeaponRoom extends MapTile {
    private Weapon randomWeapon;

    public WeaponRoom(int x, int y) {
        super(x, y);

    }
    public boolean pickedItem = false;

    public WeaponRoom(int x, int y, Weapon randomWeapon) {
        super(x, y, randomWeapon);
        this.randomWeapon  = randomWeapon;
    }

    public void addLoot(Player the_player) {
        the_player.inventory.add(randomWeapon);
        System.out.printf("You receive %s.\n", randomWeapon.name);
        pickedItem = true;
    }

    public void modify_player(Player the_player) {
        if (pickedItem == false) {
            addLoot(the_player);
            System.out.printf("You receive %s. You now do %d damage...", randomWeapon, randomWeapon.getDamage());
            the_player.setDamage(randomWeapon.getDamage());
        } else {
            System.out.printf("The item %s is already picked \n", randomWeapon.name);
        }


    }
}


