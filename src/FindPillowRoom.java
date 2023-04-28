public class FindPillowRoom extends WeaponRoom {

    private Pillow pillow;
    public FindPillowRoom(int x,int y,Pillow pillow){
        super(x, y,pillow);
    }

    public String intro_text(){
        return "You look around and see a massive body pillow.\nYou pick it up and think that it will make an awesome weapon" +
                "\nYou notice that it does less damage than your own fists...How useless. Must be a development bug.";

    }
}