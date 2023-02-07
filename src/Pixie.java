public class Pixie extends Enemy{
    //Same thing...Only a constructor just overloaded.

    private Magic magic;

    public Pixie(String name,String description,int hp,int damage,int height) {
        super(name, description, hp, damage,height);
    }
    public Pixie(String name,String description,int hp,int damage) {
        super(name, description, hp, damage, 4);
    }

    public Pixie(){
            super("Pixie","A small mythical creature with sparkles around it.",15,3,4);
    }

    public Pixie(String name,String description,int hp,int damage,Magic magic){
        super(name, description, hp, damage, 4);
        this.magic = magic;
    }

}
