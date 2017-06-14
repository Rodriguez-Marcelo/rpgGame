/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.view;

import java.util.Scanner;
import slayergame.SlayerGame;
import slayergame.control.GameControl;
import slayergame.control.ScenarioGenerator;

/**
 *
 * @author Chicho
 */
public class Narrator {
    
    public void displayScenario (ScenarioGenerator scenario1){
        
        String locationName = scenario1.getLocationName();
        String scenarioDesc = scenario1.getDescription();
        String scenarioChoices = scenario1.getChoices();
        
        System.out.println( locationName + "\n\n" + scenarioDesc + "\n\n"
                            + scenarioChoices );
        
    }
    
    public int getMenuOption() {
        
        Scanner keyboard = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        
        while (!valid) {
            
            value = keyboard.nextInt();
            
            if (value < 1) {
                System.out.println("\nInvalid value! Please choose a path...");
                continue;
            }
            
            break;
        }
        
        return value;
    }

    public boolean doAction(int choice) {
        
        switch (choice) {
            case 1:
                GameControl.createNewGame(SlayerGame.getPlayer());
                break;
            case 2:
                GameControl.saveGame(SlayerGame.getPlayer());
                break;
            case 3:
                GameControl.loadSavedGame(SlayerGame.getPlayer());
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("\n*** Invalid selection, please try again ***");
        }
        
        
        return true;
    }
    
}
