public class Ifrit extends Enemy{

    public Ifrit(String name,String description,int hp,int damage,int height) {
        super(name, description, hp, damage,height);
    }
    public Ifrit(String name,String description,int hp,int damage) {
        super(name, description, hp, damage, 100);
    }
    public Ifrit(){
        super("Ifrit","The demon of flames,said to control the strongest of scorching fires.",200,30,100);
    }


}
