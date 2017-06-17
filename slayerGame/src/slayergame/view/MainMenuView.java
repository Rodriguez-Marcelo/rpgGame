/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.view;

import java.util.Scanner;
import slayergame.SlayerGame;
import slayergame.control.GameControl;

/**
 *
 * @author Chicho
 */
public class MainMenuView extends View {

        public MainMenuView() {
        super("\n"
                + "\n+-----------------------------------+"
                + "\n|             Main Menu             |"
                + "\n+-----------------------------------+"
                + "\n|            1 - New Game           |"
                + "\n|            2 - Save Game          |"
                + "\n|            3 - Load Game          |"
                + "\n|            4 - How to play        |"
                + "\n|            5 - Exit               |"
                + "\n+-----------------------------------+");
    }

    /*
    public void displayMainMenuView() {
        
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }

    public String getMenuOption() {
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println(this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break;
        }
        
        return value;
    }

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        
    }


    private void startNewGame() {
        
        GameControl.createNewGame(SlayerGame.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
*/
        
    private void saveGame() {
        System.out.println("\n *** saveGame() function called ***");
    }

    private void loadSavedGame() {
        System.out.println("\n *** loadSavedGame() function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("\n"
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
                GameControl.saveGame(SlayerGame.getPlayer());
                break;
            case 3:
                GameControl.loadSavedGame(SlayerGame.getPlayer());
                break;
            case 4:
                this.displayHelpMenu();
                break;
            case 5:
                break;
            default:
                System.out.println("\n*** Invalid selection, please try again ***");
        }
        
        
        return true;
    }
    
}
