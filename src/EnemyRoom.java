public class EnemyRoom extends MapTile{

    private static Enemy enemy;

    public EnemyRoom(int x, int y,Enemy enemy){
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
    public static Enemy getWEnemy() {
        Enemy currentEnemy  =  enemy;
        return currentEnemy;
    }
}