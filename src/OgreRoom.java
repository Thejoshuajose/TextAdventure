public class OgreRoom extends MapTile{
    public OgreRoom(int x,int y){
        super(x, y);
    }

    public String intro_text(){
        return "You enter a room and hear a deep growl.\nYou look around and a ogre jumps down from the roof?!?." +
                "\nThe hits you with its club from above and deals 20 damage.";
    }
}
