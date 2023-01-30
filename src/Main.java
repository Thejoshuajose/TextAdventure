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
        Enemy spotDog = new Enemy("Spot Dog","A spotty dog who isn't very friendly",20,15);
        Enemy smallPixie = new Enemy("Small Pixie","A small mythical creature who doesn't seem to like you.",15,3);

    }
}

