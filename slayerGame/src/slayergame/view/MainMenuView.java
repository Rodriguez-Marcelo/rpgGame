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
public class MainMenuView {
    
    private String menu;

        public MainMenuView() {
        this.menu = "\n"
                + "\n+-----------------------------------+"
                + "\n|             Main Menu             |"
                + "\n+-----------------------------------+"
                + "\n|            N - New Game           |"
                + "\n|            S - Save Game          |"
                + "\n|            L - Load Game          |"
                + "\n|            H - How to play        |"
                + "\n|            E - Exit               |"
                + "\n+-----------------------------------+";
    }

    
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
        
        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "S":
                this.saveGame();
                break;
            case "L":
                this.loadSavedGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "E":
                break;
            default:
                System.out.println("\n*** Invalid selection, please try again ***");
        }
        
        
        return true;
    }

    private void startNewGame() {
        
        GameControl.createNewGame(SlayerGame.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void saveGame() {
        System.out.println("\n *** saveGame() function called ***");
    }

    private void loadSavedGame() {
        System.out.println("\n *** loadSavedGame() function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("\nThe main goal of the game is for you"
                + "\nto survive all the obstacles and puzzles thrown  "
                + "\nat you by the natural or artificial vicisitudes  "
                + "\nof Kchymera's environments. Choices will be your "
                + "\nmain tool. When coming across with specific      "
                + "\nscenarios, you'll be able to check your inventory"
                + "\nand use whatever you managed to scavenge while   "
                + "escaping whatever it is it's hunting you at the time.");
                }
    
}
