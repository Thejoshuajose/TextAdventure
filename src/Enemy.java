public class Enemy {

    protected String name;
    protected String description;
    protected int hp;
    protected int damage;

    public Enemy(String name,String description,int hp,int damage){
        this.name = name;
        this.description = description;
        this.damage = damage;
        this.hp = hp;
    }

    public boolean is_alive(){
        return (this.hp > 0);
    }
}
