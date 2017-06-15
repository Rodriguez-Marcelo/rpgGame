/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.control;

import java.util.Scanner;
import slayergame.SlayerGame;
import slayergame.model.Player;
import slayergame.view.Narrator;

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

    public static void createNewGame(Player player) {
        
        //Here I create a locationView object, wich will display
        //where the user is and what are his options.
        ScenarioGenerator scenario = new ScenarioGenerator();
        scenario.generateScenario(player.getCurrentLocation());
        
        Narrator narrator = new Narrator();
        
        for (int i = 0; i < 30 || i == 99; i++){
            narrator.displayScenario(scenario);
            int choice = narrator.getMenuOption();

            MovementControl movementControler = new MovementControl();
            player.setCurrentLocation(movementControler.moveToScenario(player.getCurrentLocation(), choice));

            scenario.generateScenario(player.getCurrentLocation());
            
            if(player.getCurrentLocation() == 2){
                System.out.println("Blocker has been called");
            } else if (player.getCurrentLocation() == 6) {
                System.out.println("Blocker has been called");
            } else if (player.getCurrentLocation() == 12){
                System.out.println("Blocker has been called");
            }
            
        }
        
    }

    public static void saveGame(Player player) {
        System.out.println("\n *** saveGame() function is called ***");
    }

    public static void loadSavedGame(Player player) {
        System.out.println("\n *** loadSavedGame() function is called ***");
    }

    
}
