/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import slayergame.SlayerGame;

/** Chicho & Cristian **/
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = SlayerGame.getInFile();
    protected final PrintWriter console = SlayerGame.getOutFile();
    
    public View(){
        
    }
    
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
        System.out.println();
        boolean done = false;
        try{
        do {
            int menuOption = this.getInput();
            if (menuOption < 1 || menuOption > 5)
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
        } catch (Throwable te){
            System.out.println("Invalid option, please try a VALID input. The game only takes number from 1 to 5.");
                    do {
            int menuOption = this.getInput();
            if (menuOption < 1 || menuOption > 5)
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
        }
        /*System.out.println("\n *** displayStartProgram() function called ***");*/
    }
    @Override
    public int getInput() {
        
        if (this.displayMessage == null){this.displayMessage = ("");}
        

        boolean valid = false;
        int value = 0;
        String stringChoice = null;
        try{
            while (!valid) {
                System.out.println(this.displayMessage + "\n\nEnter your choice:");

                stringChoice = this.keyboard.readLine();
                value = Integer.parseInt(stringChoice);

                if (value < 1 || value > 5) {
                    System.out.println("*** You must enter a valid option ***");
                    continue;
                }

                break;
            }
        } catch (Exception e){
            System.out.println("Error reading input: " + e.getMessage());
        }
        
        return value;
        
    }   
    
     
    
     
     
}
