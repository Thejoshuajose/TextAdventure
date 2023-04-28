public class FirstBossRoom extends EnemyRoom{
    private Ifrit ifrit;
    public FirstBossRoom(int x, int y,Ifrit ifrit) {
        super(x,y,ifrit);
        this.ifrit = ifrit;
    }

    public String intro_text(){
        return "'So you have made it to the end of the first floor....'\nA giant door stands behind a tall dark figure. You get a chill down your spine." +
                "\nIfrit Demon of Fire Appears before you laughing. His laugh echos through the labyrinth and shakes the ground beneath your feet.\nIfrit launches a giant fireball dealing 30 damage...Bro we might have to nerf him XD\n";
    }
    public void modify_player(Player the_player){
        if (ifrit.is_alive()) {
            the_player.hp = (short) (the_player.hp - ifrit.damage);

            System.out.printf("The Enemy you are facing does %d Damage. You have %d Health Remaining...", ifrit.damage, the_player.hp);


        }
    }
}
