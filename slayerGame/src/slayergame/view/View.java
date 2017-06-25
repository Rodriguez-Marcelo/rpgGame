/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.view;

import java.util.Scanner;

/** Chicho & Cristian **/
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View(){
        
    }
    
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
        System.out.println();
        boolean done = false;
        do {
            int menuOption = this.getInput();
            if (menuOption < 1 || menuOption > 5)
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
        
        /*System.out.println("\n *** displayStartProgram() function called ***");*/
    }
    @Override
    public int getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        int value = 0;
        
        while (!valid) {
            System.out.println("\n" + this.displayMessage + "\n\n\nEnter your choice:");
            
            value = keyboard.nextInt();
            
            if (value < 1 || value > 5) {
                System.out.println("*** You must enter a valid option ***");
                continue;
            }
            
            break;
        }
        
        return value;
        
    }   
    
     
    
     
     
}
