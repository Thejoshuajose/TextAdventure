public class PixieRoom  extends EnemyRoom{

    private Pixie pixie;
    public PixieRoom(int x,int y, Pixie pixie){
        super(x, y,pixie);
        this.pixie = pixie;
    }

    public String intro_text(){
        return "You look around you see a shimmering light.\nYou look around and realize that there is a pixie behind you." +
                "\nThe pixie shoots magic SparkleBalls at your ankles.";
    }
    public void modify_player(Player the_player) {
        if (pixie.is_alive()) {
            the_player.hp = (short) (the_player.hp - pixie.damage);

            System.out.printf("The Enemy you are facing does %d Damage. You have %d Health Remaining...", pixie.damage, the_player.hp);


        }
    }
}