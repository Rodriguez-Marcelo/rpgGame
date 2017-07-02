/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.view;

import java.util.Scanner;
import slayergame.exceptions.MovementControlException;

/** Chicho & Cristian **/
public class DoorBlockView {
    
    public double getInput() throws MovementControlException {
        
        Scanner keyboard = new Scanner(System.in);
        double value = 0;
        boolean valid = false;
        
        while (!valid) {
            
            value = keyboard.nextDouble();
            
            if (value < 1) {
                
                throw new MovementControlException("\nInvalid value! Cannot print something that small...");
                //System.out.println("\nInvalid value! Cannot print something that small...");

            }
            
            break;
        }
        
        return value;
    }

}
