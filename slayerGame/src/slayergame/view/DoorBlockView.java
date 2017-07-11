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
                //System.out.println("\nInvalid value! Cannot print something that small...");

            }
            
            break;
        }
        } catch (Exception e){System.out.println("Error reading input: " + e.getMessage());}
        
        return value;
    }

    @Override
    public boolean doAction(int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
