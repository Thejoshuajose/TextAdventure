import java.io.IOException;

import static java.lang.System.in;

public class Game {

    public static void main (String[] args)throws IOException{
        World world = new World();
        world.load_tiles();
        String playerName = "Joshua";
        Player player = new Player(playerName);

        MapTile room = World.tile_exists(player.location_x, player.location_y);
        if (room != null)
        {
            System.out.println(StartingRoom.intro_text());
            while ((player.is_alive()) && (!player.victory)){
                room = World.tile_exists(player.location_x, player.location_y);

                room.modify_player(player);

                if ((player.is_alive()) && (!player.victory)){
                    System.out.println("\n Action: ");
                    char action_input = in.readLine().charAt(0);
                    for (Action action:available_actions){
                        if (action_input == action.getHotkey()){
                            player.do_action(action, action.getKwargs(),room);
                            break;
                        }
                    }
                }

            else
            }
        }

    }
}
