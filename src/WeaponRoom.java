public class WeaponRoom extends MapTile{
        private Weapon randomWeapon;

        public WeaponRoom(int x, int y){
            super(x,y);

        }

        public void modify_player(Player the_player){
            if ((the_player.inventory.contains(randomWeapon))) {
                System.out.println("I've been here already...");
            }else
                    the_player.inventory.add(randomWeapon);

                    System.out.printf("You receive %d. You now do %d damage...", randomWeapon, randomWeapon.getDamage());;
                }


            }


