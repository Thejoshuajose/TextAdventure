public class Ogre extends Enemy {
    //There isn't necessarily an input for ogre...just a constructor
    public Ogre(String name,String description,int hp,int damage) {
        super(name, description, hp, damage);
    }
    public Ogre(){
        super("Ogre","An ugly midsize ogre.",30,20);
    }
}
