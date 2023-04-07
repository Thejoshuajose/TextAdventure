public class FindPillowRoom extends MapTile {
    public FindPillowRoom(int x,int y){
        super(x, y);
    }

    public String intro_text(){
        return "You look around and see a massive body pillow.\nYou pick it up and think that it will make an awesome weapon" +
                "\nYou notice that it does less damage than your own fists...How useless. Must be a development bug.";
    }
}
