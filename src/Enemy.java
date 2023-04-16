public abstract class Enemy {

    protected String name;
    protected String description;
    protected int hp;
    protected int damage;
    protected int height;
//Height is in inches

    public Enemy(String name,String description,int hp,int damage,int height){
        this.name = name;
        this.description = description;
        this.damage = damage;
        this.hp = hp;
        this.height = height;

    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public boolean is_alive(){
        return (this.hp > 0);
    }
}