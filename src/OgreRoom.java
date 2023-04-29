public class OgreRoom extends EnemyRoom {

    private Ogre greenOgre;

    public OgreRoom(int x, int y,Ogre greenOgre) {
        super(x, y,greenOgre);
        this.greenOgre = greenOgre;
    }

    public String intro_text() {
        return "You enter a room and hear a deep growl.\nYou look around and a ogre jumps down from the roof?!?." +
                "\nThe hits you with its club from above.";
    }

    public void modify_player(Player the_player) {

        if (greenOgre.is_alive()) {
            the_player.hp = (short) (the_player.hp - greenOgre.damage);

            System.out.printf("The Enemy you are facing does %d Damage. You have %d Health Remaining...", greenOgre.damage, the_player.hp);


        } else {
            greenOgre.setHp(-1);
            greenOgre.setDamage(0);
        }
    }
}