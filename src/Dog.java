public class Dog extends Enemy{
    //Same thing...Only a constructor just overloaded
    public Dog(String name,String description,int hp,int damage,int height) {
        super(name, description, hp, damage,height);
    }
    public Dog(String name,String description,int hp,int damage) {
        super(name, description, hp, damage,18);
    }
    public Dog(){
        super("Dog","A dog who isn't very friendly",20,15,18);
    }

}
