public class ZombieRoom extends EnemyRoom {
    private boolean pickedEnemy = false;
    private Enemy greenZombie;
    public ZombieRoom(int x, int y,Zombie greenZombie){
        super(x, y,greenZombie);
        this.greenZombie = greenZombie;
    }

    public String intro_text(){
        return "The phrase 'BRAIIINNNSSS!!!' rings in your ears.\nA zombie runs up towards you at full speed and hits you with his detached arm.\n";
    }



    public void modify_player(Player the_player) {
        if (greenZombie.is_alive()) {
            the_player.hp = (short) (the_player.hp - greenZombie.damage);
            System.out.printf("The Enemy you are facing does %d Damage. You have %d Health Remaining...", greenZombie.damage, the_player.hp);
        } else {
            pickedEnemy = true;
            greenZombie.setHp(-1);
            greenZombie.setDamage(0);

        }

        }
    }

