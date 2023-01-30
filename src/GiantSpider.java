public class GiantSpider extends Enemy{
    //Same thing...Only a constructor just overloaded
    public GiantSpider(String name,String description,int hp,int damage) {
        super(name, description, hp, damage);
    }
    public GiantSpider(){
        super("Giant Spider","An arachnid that hates people.",10,2);
    }

}