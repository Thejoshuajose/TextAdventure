import java.util.*;
public class Player {


    String name;
    boolean life = true;

    short hp = 100; //16 bit
    short stamina = 100;
    short damage = 5;

     int location_x;
     int location_y;


    public Player (String name){
        super();
        this.hp = 100;
        this.stamina = 100;
        this.location_x = World.Starting_Position.x;
        this.location_y = World.Starting_Position.y;

    }

    public Player(String name,short hp,short stamina,short damage,boolean life){
        this.name = name;
        this.hp = hp;
        this.stamina = stamina;
        this.damage = damage;
        this.life = life;
        this.location_x = World.Starting_Position.x;
        this.location_y = World.Starting_Position.y;
    }
    public Player(String name,short hp,short stamina,short damage){
        this.name = name;
        this.hp = hp;
        this.stamina = stamina;
        this.damage = damage;
        this.location_x = World.Starting_Position.x;
        this.location_y = World.Starting_Position.y;
    }
    public Player(String name,short hp,short stamina){
        this.name = name;
        this.hp = hp;
        this.stamina = stamina;
        this.location_x = World.Starting_Position.x;
        this.location_y = World.Starting_Position.y;

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
    public void do_action(Action action, Enemy kwargs, MapTile mp){
            if (kwargs == null){

        }
    }
}
