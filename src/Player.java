public class Player {

    String name;
    boolean life = true;

    short hp = 100; //16 bit
    short stamina = 100;
    short damage = 5;

    public Player(String name,short hp,short stamina,short damage,boolean life){
        this.name = name;
        this.hp = hp;
        this.stamina = stamina;
        this.damage = damage;
        this.life = life;
    }
    public Player(String name,short hp,short stamina,short damage){
        this.name = name;
        this.hp = hp;
        this.stamina = stamina;
        this.damage = damage;
    }
    public Player(String name,short hp,short stamina){
        this.name = name;
        this.hp = hp;
        this.stamina = stamina;

    }
    public Player(String name){
        this.name = name;

    }

    public boolean getLife(){
        if (hp<=0)
            life = false;
        else
            life = true;
        return life;
    }

    public boolean is_alive(){
        return (this.hp > 0);
    }

    //byte byte1 = 127;
    //int hp; 32 bit
    //long example2; 64 bit

}
