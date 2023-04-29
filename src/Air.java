public class Air extends Enemy{
    public Air(String name,String description,int hp,int damage,int height) {
        super(name, description, hp, damage,height);
    }
    public Air(String name,String description,int hp,int damage) {
        super(name, description, hp, damage,18);
    }
    public Air(){
        super("Air","Nothing here",0,0,18);
    }

}
