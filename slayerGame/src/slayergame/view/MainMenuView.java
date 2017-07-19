/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.view;

import java.io.IOException;
import java.util.Scanner;
import slayergame.SlayerGame;
import slayergame.control.GameControl;
import slayergame.exceptions.GameControlExceptions;
import slayergame.model.Game;

/** Chicho & Cristian **/
public class MainMenuView extends View {

        public MainMenuView() {
        super("\n"
                + "\n+-----------------------------------+"
                + "\n|             Main Menu             |"
                + "\n+-----------------------------------+"
                + "\n|            1 - New Game           |"
                + "\n|            2 - Load Game          |"
                + "\n|            3 - How to play        |"
                + "\n|            4 - Exit               |"
                + "\n+-----------------------------------+");
    }

    private void displayHelpMenu() {
        this.console.println("\n"
                + "\n+--------------------------------------------------+"
                + "\n| The main goal of the game is for you to survive  |"
                + "\n| all the obstacles and puzzles thrown at you by   |"
                + "\n| the natural or artificial vicisitudes of         |"
                + "\n| environments. Choices will be your main tool.    |"
                + "\n| When coming across with specific scnenarios, you |"
                + "\n| will be able to check your inventory and use     |"
                + "\n| anything you managed to scavenge while escaping  |"
                + "\n| whatever it is hunting you at the time.          |"
                + "\n+--------------------------------------------------+");
        boolean done = false;
        do {
            int menuOption = this.getInput();
            if (menuOption < 1 || menuOption > 5)
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }

    @Override
    public boolean doAction(int choice) {
        switch (choice) {
            case 1:
                GameControl.createNewGame(SlayerGame.getPlayer());
                break;
            case 2:
                this.saveGame();
                break;
            case 3:
                GameControl.loadSavedGame(SlayerGame.getPlayer());
                break;
            case 4:
                this.displayHelpMenu();
                break;
            case 5:
                break;
            case 6:
                Narrator narrator = new Narrator();
                narrator.displayMessage("" 
                + "\n+-----------------------------------+" 
                + "\n|             Main Menu             |" 
                + "\n+-----------------------------------+" 
                + "\n|           10 - New Game           |" 
                + "\n|           20 - Save Game          |" 
                + "\n|           30 - Load Game          |" 
                + "\n|           40 - How to play        |" 
                + "\n|           50 - Exit               |" 
                + "\n+-----------------------------------+");
                choice = narrator.getInput();
                narrator.doAction(choice);    
            default:
                System.out.println("\n*** Invalid selection, please try again ***");
        }
        return true;
    }
    
    private void saveGame(){
        this.console.println("\n\nEnter File Path for save:");
        
        String filePath = this.getInput2();
        
        try {
            GameControl.saveGame(SlayerGame.getCurrentGame(), filePath);
        }catch (Exception ex){
            ErrorView.display("MainMenuView", displayMessage);
        }
    }
}
