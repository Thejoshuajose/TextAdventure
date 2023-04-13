public class FindArrowRoom extends LootRoom{

    private Arrow arrow;
    public FindArrowRoom(int x, int y, Arrow arrow){
        super(x,y,arrow);
    }

    public String intro_text(){
        return "You look around and see an arrow.\nYou pick it up it and notice the end is a sharp flint arrow head." +
                "\nYou notice that it does whopping 6 damage.";
    }


}