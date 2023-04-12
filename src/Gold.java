public class Gold extends Item{
    protected int amt;;
    protected String name;

    public Gold(){
        super( "Gold Coin",String.format("A stack of %s gold coins.",15),1);
    }
    public Gold(int amt){
        super("Gold Bar", String.format("A stack of %s gold coins.", String.valueOf(amt)),amt);
        this.amt  = amt;
    }

}