public class Main {
    public static void main(String[] args) {
        Mace bigMace = new Mace("Big Mace", "A Big Mace. Slightly more dangerous from a regular mace.", 15,30);
        Gold goldBar = new Gold(10);
        Pillow softPillow = new Pillow("Soft Pillow","A pillow, super soft.",1,1);
        Sword magicSword = new Sword("Magic Sword","A shiny sword with magic flowing around it.",20,40);
        Ogre greenOgre = new Ogre("Green Ogre","An ugly green ogre",30,20);
        Ogre redOgre = new Ogre("Red Ogre","An ugly red ogre",30,20);
        Zombie slowZombie = new Zombie("Slow Zombie","A zombie who isn't really athletic",20,15);
        Zombie fastZombie = new Zombie("Fast Zombie","A zombie who is athletic",20,15);
        Dog spotDog = new Dog("Spot Dog","A spotty dog who isn't very friendly",20,15);
        GiantSpider giantSpider = new GiantSpider("Giant Spider","A very big arachnid.",20,15);
        Pixie smallPixie = new Pixie("Small Pixie","A small mythical creature who doesn't seem to like you.",15,3);

        Player player1= new Player("Joker");
        if (player1.getLife()==true)
            System.out.println("Player is alive");
        else
            System.out.println("Player is dead");

        World world  = new World();
        world.load_tiles();

    }

}
