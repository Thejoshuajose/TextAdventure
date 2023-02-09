public abstract class Item {
    protected String name;
    protected String description;
    protected int value;

    //
    public Item(String name,String description, int value){
        this.name = name;
        this.description = description;
        this.value=value;
    }

    public String toString(){
        return String.format("%s \n=====\n %s \nValue: %d \n", this.name, this.description, this.value);
    }
}
