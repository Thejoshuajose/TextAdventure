public class DogRoom extends EnemyRoom{

    private Dog pitbull;
    public DogRoom(int x, int y,Dog pitbull){
        super(x,y);
        this.pitbull = pitbull;
    }

    public String intro_text(){
        return "You look around and see a massive pitbull.\nIt sees you barks at you then runs towards you at full speed" +
                "\nThe pitbull bites you.";
    }
    public void modify_player(Player the_player) {
        if (pitbull.is_alive()) {
            the_player.hp = (short) (the_player.hp - pitbull.damage);

            System.out.printf("The Enemy you are facing does %d Damage. You have %d Health Remaining...", pitbull.damage, the_player.hp);


        }
    }
}