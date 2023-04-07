public class ZombieRoom extends MapTile {
    public ZombieRoom(int x,int y){
        super(x, y);
    }

    public String intro_text(){
        return "The phrase 'BRAIIINNNSSS!!!' rings in your ears.\nA zombie runs up towards you at full speed and hits you with his detached arm." +
                "\nThe zombie does 15 damage.";
    }
}
