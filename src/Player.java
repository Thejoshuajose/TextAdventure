import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class Player implements Comparable<Player> {

    //Class Variables
    //Item inventory[];
    int hp;
    String name;
    public int compareTo(Player othrPlyr)
    {
        return othrPlyr.score.compareTo(this.score);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHp() {
        return hp;
    }


    int plyrGold;
    Integer score;
    Boolean	 victory;
    int location_x, location_y;
    int prevLocatnX,prevLocatnY;

    int damage;

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage(){return damage;}

    ArrayList<Item> inventory = new ArrayList<Item>();

    //Constructor method
    public Player(String name){
        super();
        this.name= name;
        inventory.add(new Gold(30));
        inventory.add(new Stick());
        this.damage = getDamage();
        this.hp = 140; // Health Points
        this.location_x = World.Starting_Position.x;
        this.location_y = World.Starting_Position.y;
        this.victory = false; //no victory on start up
    }

    public Player() {
        // TODO Auto-generated constructor stub
    }

    //	public void flee(MapTile tile){
//	    //Moves the player randomly to an adjacent tile
//        ArrayList<MapTile> available_moves = tile.adjacent_moves();
 //       r = Random.radiant(0, len(available_moves) - 1);
//        Random r = new Random();
//        //do_action(available_moves[r]);
//	}
//
    public boolean is_alive(){
        return (hp > 0);   //Greater than zero value then you are still alive
    }
    //
    public void print_inventory(){
        int totalGold=0;Gold geld=null ;
        for (Item item: inventory){
            if(!(item instanceof Gold))
            {

                System.out.println(item.toString());
            }
            else
            {
                geld = (Gold)item;
                totalGold += geld.amt;
            }

        }
        Item gold = new Gold(totalGold);
        plyrGold = totalGold;
        System.out.println(gold.toString());
    }

    public void updateGold()
    {
        int totalGold=0;Gold geld=null ;
        for (Item item: inventory){
            if(!(item instanceof Gold))
            {

            }
            else
            {
                geld = (Gold)item;
                totalGold += geld.amt;
            }

        }
        Item gold = new Gold(totalGold);
        plyrGold = totalGold;

    }

    public void writeToFile()
    {
        updateGold();
        try {
            File fw = new File("Scores.txt");
            if(!fw.exists() )
            {
                fw.createNewFile();
            }

            FileWriter fobj= new FileWriter(fw,true);
            PrintWriter pobj = new PrintWriter(fobj);
            pobj.println(name+"\t"+plyrGold);

            pobj.close();
            fobj.close();
            FileReader frdr = new FileReader(fw);
            BufferedReader brdr= new BufferedReader(frdr);
            String entry = "";
            ArrayList<Player> plyrs = new ArrayList<Player>();
            while((entry=brdr.readLine()) != null)
            {
                String arr[] = entry.split("\t");
                Player plyr = new Player();
                plyr.setName(arr[0]);
                plyr.setScore(Integer.parseInt(arr[1]));
                plyrs.add(plyr);
            }

            Collections.sort(plyrs);
            for(Player p:plyrs)
            {
                System.out.println("Name:"+p.getName()+"    Score:"+p.getScore());

            }

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }


    }

    public void move(int dx, int dy){
        prevLocatnX = location_x;
        prevLocatnY = location_y;
        location_x += dx;
        location_y += dy;
        System.out.print(World.tile_exists(location_x, location_y).intro_text());
    }

    public void move_north(){
        move(-1,0);
    }

    public void move_south(){
        move(1,0);
    }

    public void move_east(){
        move(0,1);
    }

    public void move_west(){
        move(0,-1);
    }

    public void doFlee(MapTile mp)
    {
        System.out.println("You throw up your mini flag that says 'FLEE' and run away like a coward...\nHow shameful...You run away to another room.");
        ArrayList<Action> available_moves = mp.adjacent_moves();
        Random rn=new Random();
        int random=rn.nextInt(available_moves.size());
        Action randomAction=available_moves.get(random);
        do_action(randomAction, null, null);

    }

    public void dodge(Enemy enemy) {
        double chance = Math.random() * 100;
        if (chance < 30) { // 0-30
            System.out.println("You Dodge this attack by a hair");
            enemy.setDamage(0);
        }
        else if (chance > 30){ // 30-100
            System.out.println("You tried to dodge but still got hit. However, you only take half the damage");
            enemy.setDamage(getDamage()/2);
        }
    }

   public void attackEnemy(Enemy  enemy)
    {
        int plyrdamage = getDamage();
        int enemyhp = 0;

        System.out.println("You attacked the enemy for " + plyrdamage + " damage.");
        enemyhp = enemy.hp - plyrdamage;
        System.out.println("The Enemy has " + enemyhp + " health remaining.");
        enemy.setHp(enemyhp);
        if (enemy.hp <= 0) {
            System.out.println("The enemy has been defeated!");
            enemy.setDamage(0);
            enemy = null;
        }
        else {
            System.out.println("The enemy has " + enemy.hp + " HP left.");
            if (this.hp <= 0) {
                System.out.println("You have been defeated!");
                enemy = null;


            }
        }
    }




    public void do_action(Action action, Enemy enemy, MapTile mp) {
        if (action instanceof MoveEast) {
            move_east();
        } else if (action instanceof MoveWest) {
            move_west();
        } else if (action instanceof MoveNorth) {
            move_north();
        } else if (action instanceof MoveSouth) {
            move_south();
        } else if (action instanceof ShowInventory) {
            print_inventory();
        } else if (action instanceof RunAway) {
            doFlee(mp);
        } else if (action instanceof Attack) {
            attackEnemy(enemy);
        } else if (action instanceof Dodge) {
            dodge(enemy);
        }
    }
//End Code block do_attack method*/
}

 //End Code block class
