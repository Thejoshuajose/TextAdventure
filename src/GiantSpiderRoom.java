public class GiantSpiderRoom extends EnemyRoom{

    private GiantSpider giantSpider;
    public GiantSpiderRoom(int x, int y,GiantSpider giantSpider) {
        super(x,y,giantSpider);
        this.giantSpider = giantSpider;
    }

    public String intro_text(){
        return "You hear a loud hissing sound.\nA giant spider shoots you with its web." +
                "\nYou take 7 damage. ";
    }
    public void modify_player(Player the_player) {
        if (giantSpider.is_alive()) {
            the_player.hp = (short) (the_player.hp - giantSpider.damage);

            System.out.printf("The Enemy you are facing does %d Damage. You have %d Health Remaining...", giantSpider.damage, the_player.hp);


        } else {
            giantSpider.setHp(-1);
            giantSpider.setDamage(0);
        }
    }
}