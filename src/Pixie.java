public class Pixie extends Enemy{
    //Same thing...Only a constructor just overloaded.
    public Pixie(String name,String description,int hp,int damage) {
        super(name, description, hp, damage);
    }
    public Pixie(){
            super("Pixie","A small mythical creature with sparkles around it.",15,3);
    }
}
