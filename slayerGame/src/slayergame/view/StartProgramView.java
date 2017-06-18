/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.view;

import java.util.Scanner;
import slayergame.control.GameControl;
import slayergame.model.Player;

/** Chicho & Cristian **/
public class StartProgramView extends View{
    
    private String promptMessage;
    
    public StartProgramView(){
        this.promptMessage = "\n Please enter your name:";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                  "\n+-----------------------------+"
                + "\n|    S   L   A   Y   E   R    |"
                + "\n|    =====================    |"
                + "\n|  Prepare to enter a world   |"
                + "\n|  shaped by your own         |"
                + "\n|  choices full of dangers    |"
                + "\n|  and risks at every corner  |"
                + "\n|  behind every door.         |"
                + "\n|  As you venture through     |"
                + "\n|  the world of Kchimera,     |"
                + "\n|  don't forget that only     |"
                + "\n|  courage, strength, and     |"
                + "\n|  wit will get you alive     |"
                + "\n|  untill the end.            |"
                + "\n|                             |"
                + "\n|       - HAVE FUN! -         |"
                + "\n+-----------------------------+");
    }

    public void displayStartProgramView() {
        
        boolean done = false;
        do {
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(playersName);
            
        } while (!done);
        
        /*System.out.println("\n *** displayStartProgram() function called ***");*/
    }

    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
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
    

    private boolean doAction(String playersName) {
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one charater in length");
            return false;
        }
        
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        
        this.displayNextView(player);
        
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println("\n============================================"
                         + "\n Welcome to the wolrd of Kchymera, " + player.getName()
                         + "\n Take care, and carefull where you step!"
                         + "\n============================================"
                         );
        MainMenuView mainMenuView = new MainMenuView();
                
        mainMenuView.display();
    }

    @Override
    public boolean doAction(int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
