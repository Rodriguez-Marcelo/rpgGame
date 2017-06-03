/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.view;

import java.util.Scanner;

/**
 *
 * @author Chicho
 */
public class MainMenuView {
    
    private String menu;

        public MainMenuView() {
        this.menu = "\n"
                + "\n_____________________________________"
                + "\n1            Main Menu              1 "
                + "\n-------------------------------------"
                + "\n N - New Game"
                + "\n S - Save Game"
                + "\n L - Load Game"
                + "\n H - How to play"
                + "\n E - Exit"
                + "\n_____________________________________";
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
        System.out.println("\n *** startNewGame() function called ***");
    }

    private void saveGame() {
        System.out.println("\n *** saveGame() function called ***");
    }

    private void loadSavedGame() {
        System.out.println("\n *** loadSavedGame() function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("\n *** displayHelpMenu() function called ***");
    }
  
}
