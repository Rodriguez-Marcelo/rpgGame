/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.control;

import slayergame.SlayerGame;
import slayergame.model.Player;

/**
 *
 * @author Chicho
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        SlayerGame.setPlayer(player);
        
        return player;
    }
    /*
    public static void startNewGame(){
        System.out.println("\n *** startNewGame() function called ***");
    }
    
    public static void saveGame(){
        System.out.println("\n *** saveGame() function called ***");
    }
    
    public static void loadSavedGame() {
        System.out.println("\n *** loadSavedGame() function called ***");
    }
    */
}
