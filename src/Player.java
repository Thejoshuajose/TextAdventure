import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Player implements Comparable<Player>{


    String name;

    @Override
    public int compareTo(Player otherPlayer) {
        return otherPlayer.score.compareTo(this.score);
    }

    Integer score;
    boolean life = true;

    short hp = 100; //16 bit
    short stamina = 100;
    short damage = 5;

     int location_x, location_y;
    int prevXlocation, prevYlocation;

     int playerGold;

    public boolean victory;

    public Player (String name){
        super();
        this.hp = 100;
        this.stamina = 100;
        inventory.add(new Gold(30));
        this.victory = false; //Cannot Win if you just started
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

    public int getScore(){return score;}
    public void  setScore(){this.score = score;}
    public boolean is_alive(){
        return (this.hp > 0);
    }

    public void move(int xx, int yy){
        prevXlocation = location_x;
        prevYlocation = location_y;
        location_x = xx;
        location_y = yy;
        System.out.println(World.tile_exists(location_x,location_y).intro_text());
    }

    public void moveNorth(){
        move(-1,0);
    }
    public void moveEast(){
        move(0,1);
    }
    public void moveSouth(){
        move(1,0);
    }
    public void moveWest(){
        move(0,-1);
    }

    public void runAway(MapTile mp){
        ArrayList<Action> available_moves = mp.adjacent_moves();
        Random rn = new Random();
        int random = rn.nextInt(available_moves.size());
        Action randomAction = (Action) available_moves.get(random);
        do_action(randomAction,null,null);

    }
    public void show_inventory(){
        int totalGold = 0;Gold gold = null;
        for (Item item: inventory){
            if(!(item instanceof Gold)){
                System.out.println(item.toString());
            }
            else{
                gold = (Gold)item;
                totalGold += gold.amt;
            }
        }
    }
    public void update_Gold(){
        int totalGold = 0;Gold gold = null;
        for (Item item: inventory){
            if(!(item instanceof Gold)){
                System.out.println(item.toString());
            }
            else{
                gold = (Gold)item;
                totalGold += gold.amt;
            }
        }
    }

    ArrayList<Item> inventory = new ArrayList<>();


    //byte byte1 = 127;
    //int hp; 32 bit
    //long example2; 64 bit
    public void do_action(Action action, Enemy kwargs, MapTile mp){
            if (kwargs == null){
                if(action instanceof MoveEast){
                    moveEast();
                } else if (action instanceof MoveNorth) {
                    moveNorth();
                }else if (action instanceof MoveWest){
                    moveWest();

                }else if (action instanceof MoveSouth){
                    moveSouth();
                } else if (action instanceof ShowInventory) {
                    show_inventory();

                }
                //else if(action instanceof RunAway){
                    //runAway();
                //}
            }
    }



    public void writeToFile() {
        update_Gold();
        try {
            File file = new File(Scores.txt);
            if (!file.exists()){

            }
        }
    }
}
