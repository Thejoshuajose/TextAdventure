public class Gold extends Item{
    private int amt;

    public Gold(int amt){
        super("Gold Bar", String.format("A round bar with %s stamped on the front.", String.valueOf(amt)),amt);
        this.amt  = amt;
    }

    }
