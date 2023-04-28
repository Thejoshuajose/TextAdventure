public class FindMaceRoom extends WeaponRoom
{

    private Mace BigMace;
    public FindMaceRoom(int x, int y, Mace BigMace){
        super(x,y,BigMace);
    }

    public String intro_text(){
        return "You look around and see a Heavy Spike Balled Mace.\nYou pick it up it feels like it would pack a serious punch against the enemies faced so far." +
                "\nYou notice that it does whopping 30 damage... Let Him COOK.";
    }


}