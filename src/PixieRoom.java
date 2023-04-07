public class PixieRoom  extends MapTile{
    public PixieRoom(int x,int y){
        super(x, y);
    }

    public String intro_text(){
        return "You look around you see a shimmering light.\nYou look around and realize that there is a pixie behind you." +
                "\nThe pixie shoots magic SparkleBalls at your ankles it does five damage";
    }
}
