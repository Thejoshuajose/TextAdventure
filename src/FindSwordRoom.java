public class FindSwordRoom extends WeaponRoom{

    private Sword magicSword;
    public FindSwordRoom(int x, int y,Sword magicSword){
        super(x,y,magicSword);

    }

    public String intro_text() {
        return "You look around and see a Magical Glowing Sword.\nYou pick it up it feels light in your hands for some reason." +
                "\nYou notice that it does whopping 45 damage... Bro why did we let them have this?!?!.";
    }


}