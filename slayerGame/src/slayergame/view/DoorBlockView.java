/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.view;

import java.util.Scanner;
import slayergame.exceptions.MovementControlException;

/** Chicho & Cristian **/
public class DoorBlockView extends View{
    

    public double getInput1() throws MovementControlException {
        
        
        double value = 0;
        boolean valid = false;
        
        try{
        while (!valid) {
            
            String stringValue = this.keyboard.readLine();
            value = Double.parseDouble(stringValue);
            
            if (value < 1) {
                
                throw new MovementControlException("\nInvalid value! Cannot print something that small...");
                

            }
            
            break;
        }
        } catch (Exception e){System.out.println("Error reading input: " + e.getMessage());}
        
        return value;
    }

    
    public boolean selectDoorAnswerCone (double totalSA){
        
        boolean openDoor;

        if (totalSA >= 68.26 && totalSA < 189.61){
            /*OK*/
            this.console.println("\n"
                + "\n+--------------------------------------------------+"
                + "\n|   It wasn't a perfect fit... but with a bit of   |"
                + "\n|   struggling, you made it stuck.                 |"
                + "\n|   The door barely opened.                        |"
                + "\n+--------------------------------------------------+");
            openDoor = true;
        } else if (totalSA > 189.61 && totalSA <= 485.41){
            /*OK*/
            this.console.println("\n"
                + "\n+--------------------------------------------------+"
                + "\n|   It wasn't a perfect fit... but with a bit of   |"
                + "\n|   struggling, you made it stuck.                 |"
                + "\n|   The door barely opened.                        |"
                + "\n+--------------------------------------------------+");
            openDoor = true;
        } else if (totalSA == 189.61){
            /*PERFECT*/
            this.console.println("\n"
                + "\n+--------------------------------------------------+"
                + "\n|    The key fitted perfectly!                     |"
                + "\n|    The door opens swiftly.                       |"
                + "\n+--------------------------------------------------+");            
            openDoor = true;
        } else {
            this.console.println("\n"
                + "\n+--------------------------------------------------+"
                + "\n|  The screen of the 3D printer flashes red,       |"
                + "\n|  displaying: ERROR - TRY AGAIN                   |"
                + "\n+--------------------------------------------------+");
            openDoor = false; 
        }
        return openDoor;
    }
    


    
    /***************************************************************************************
    ***************************************************************************************/
    
    @Override
    public boolean doAction(int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
