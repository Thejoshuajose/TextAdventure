public class EnemyRoom extends MapTile{
    private Enemy enemy;


    public EnemyRoom(int x, int y){
        super(x,y);
        this.enemy = enemy;
    }

    public void modify_player(Player the_player){
        if (enemy.is_alive())
        {
            the_player.hp  = (short) (the_player.hp - enemy.damage);

            System.out.printf("The Enemy you are facing does %d Damage. You have %d Health Remaining...", enemy.damage,the_player.hp );


        }

    }
}