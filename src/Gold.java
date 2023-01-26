public class Gold extends Item{
    private int amt;;
    protected String name;

    public Gold(String name,int amt){
        super(name, String.format("A round bar with %s stamped on the front.", String.valueOf(amt)),amt);
        this.amt  = amt;
        this.name =  name;
    }
    public Gold(int amt){
        super("Gold Bar", String.format("A round bar with %s stamped on the front.", String.valueOf(amt)),amt);
        this.amt  = amt;
    }

    }
