public class Zombie extends Enemy{
    //Same thing...Only a constructor
    public Zombie(String name,String description,int hp,int damage,int height){
        super(name,description,hp,damage,height);
    }
    public Zombie(String name,String description,int hp,int damage) {
        super(name, description, hp, damage, 62);
    }
    public Zombie(){
        super("Zombie","An undead green rotting foe.",20,15,62);
    }
}
