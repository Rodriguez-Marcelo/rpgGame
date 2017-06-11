/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.view;

import java.util.Scanner;
import slayergame.SlayerGame;
import slayergame.control.NewLocations;
import slayergame.control.MovementControl;
import slayergame.view.GameMenuView;
/**
 *
 * @author creestian
 */
public class MoveToView {

    private String menu;

        public MoveToView() {
        this.menu = "\n"
                + "\n+--------------------------------------+"
                + "\n|      - Move to new location -        |"
                + "\n| Choose a path for your next location |"
                + "\n+--------------------------------------+"
                + "\n|             A - Path A               |"
                + "\n|             B - Path B               |"
                + "\n|             C - Path C               |"
                + "\n|             D - Path D               |"
                + "\n|             E - Path E               |"
                + "\n|             H - Help                 |"
                + "\n|                                      |"
                + "\n|             Q - Quit                 |"
                + "\n+--------------------------------------+";
    }

    
    public void displayMoveToView() {
        
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
            case "A":
                NewLocations.moveToPathA(SlayerGame.getPlayer());
                break;
            case "B":
                NewLocations.moveToPathB(SlayerGame.getPlayer());
                break;
            case "C":
                NewLocations.moveToPathC(SlayerGame.getPlayer());
                break;
            case "D":
                NewLocations.moveToPathD(SlayerGame.getPlayer());
                break;
            case "E":
                NewLocations.moveToPathE(SlayerGame.getPlayer());
                break;
            case "H":
                this.choosePath();
                break;
            case "Q":
                break;
            default:
                System.out.println("\n*** Invalid selection, please try again ***");
        }
        
        
        return true;
    }

    private void moveToLocations() {
        
        NewLocations.moveToPathA(SlayerGame.getPlayer());
        
        LocationView newLocation = new LocationView();
        newLocation.choosePath();
    }

    private void pathA() {
        System.out.println("\n *** pathA() function called ***");
    }
    private void pathB() {
        System.out.println("\n *** pathB() function called ***");
    }
    private void pathC() {
        System.out.println("\n *** pathC() function called ***");
    }
    private void pathD() {
        System.out.println("\n *** pathD() function called ***");
    }
    private void pathE() {
        System.out.println("\n *** pathE() function called ***");
    }
    private void choosePath() {
        System.out.println("\n"
                + "\n+--------------------------------------------------+"
                + "\n| The main goal of the game is for you to survive  |"
                + "\n| all the obstacles and puzzles thrown at you by   |"
                + "\n| the natural or artificial vicisitudes of         |"
                + "\n| environments. Choices will be your main tool.    |"
                + "\n| When coming across with specific scnenarios, you |"
                + "\n| will be prompt to choose a path for your next    |"
                + "\n| adventure. Your choice will manage to scavenge   |"
                + "\n| while escaping whatever it is hunting you at the |"
                + "\n| time.                                            |"
                + "\n+--------------------------------------------------+");
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }
    
}

