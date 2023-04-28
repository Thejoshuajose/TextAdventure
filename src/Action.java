
public class Action {

    protected Method method;
    protected char hotkey;

    public char getHotkey() {
        return hotkey;
    }
    public void setHotkey(char hotkey){
        this.hotkey = hotkey;
    }

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private Enemy enemy;

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }
    //    public Enemy getKwargs(){
//        return kwargs;
//    }
//    public void setKwargs(Enemy kwargs){
//        this.kwargs = kwargs;
//    }

    //putting in the constructor

    public Action(Method method,String name,char hotkey,Enemy enemy){
        this.method = method;
        this.name = name;
        this.hotkey = hotkey;
        this.enemy = enemy;
    }

    public String str(){
        return hotkey + ": "+ name;
    }

}
