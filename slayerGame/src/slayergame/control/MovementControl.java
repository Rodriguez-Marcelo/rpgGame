/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.control;

import java.io.Serializable;
import slayergame.exceptions.MovementControlException;
import slayergame.model.DoorBlocker;
import slayergame.view.DoorBlockView;
import slayergame.view.Narrator;

/** Chicho & Cristian **/
public class MovementControl implements Serializable{
    
    public int moveToScenario(int currentLocation, int choice) throws MovementControlException{
        
        int futureLocation;
        
        switch (currentLocation){
            case 1:
                //Redirections from Scenario 1
                switch (choice) {
                    case 1:
                        futureLocation = 2;
                        return futureLocation;
                    case 2:
                        //Tengo que llamar al inventario y resolucionar cómo se agregan
                        //los ítems
                        break;
                    case 3:
                        futureLocation = 3;
                        return futureLocation;
                    case 4:
                        //Death
                        break;
                    case 5:
                        futureLocation = 4;
                        return futureLocation;
                    default:
                        String message = ("The value entered is not a valid input.\n Please, select another value.");
                        throw new MovementControlException(message);
                }
                break;  
            case 2:
                switch (choice) {
                    case 1:
                        futureLocation = 5;
                        return futureLocation;
                    case 2:
                        //Call inventory manager and see how can I tackle the 
                        //items usage problem
                        break;
                    case 3:
                        
                        double radius = 0.0;
                        double height = 0.0;
                        
                        DoorBlockView doorBlockView = new DoorBlockView();
                        DoorBlockControl doorBlockControl = new DoorBlockControl();
                        Narrator narrator = new Narrator();
                        narrator.displayMessage(""
                                + "\nYou see one of those famous 3D printers in the "
                                + "\nwall next to the door you're attempting to get"
                                + "\ninto. Problem is, you need a Cone key to enter."
                                + "\nYou see that the key would likely fit in your"
                                + "\nhand."
                                + "\nYou stare at the screen of the 3D Printer, and"
                                + "\nsee two input values: radius & height "
                                + "\nBelow these input boxes, you have a keypad...");
                        
                        boolean openDoor = false;
                        do{
                            
                            narrator.displayMessage("Enter the radius:");
                            radius = doorBlockView.getInput1();
                            narrator.displayMessage("Enter the height:");
                            height = doorBlockView.getInput1();
                        
                            double totalSA = doorBlockControl.calcConeKey(radius, height);
                        
                            openDoor=doorBlockView.selectDoorAnswerCone(totalSA);
                        }while(!openDoor);
                                   
                        futureLocation = 6;
                        return futureLocation;
                        
                    case 4:
                        //death
                        break;
                    case 5:
                        futureLocation = 7;
                        return futureLocation;
                    default:
                        return 0;
                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            default:
                break;
        }
        return 0;
    }
    
}
