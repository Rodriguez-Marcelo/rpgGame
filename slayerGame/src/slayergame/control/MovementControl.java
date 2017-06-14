/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.control;

import java.io.Serializable;

/**
 *
 * @author Chicho
 */
public class MovementControl implements Serializable{
    
    public int moveToScenario(int currentLocation, int choice){
        
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
                        //MUERTE
                        break;
                    case 5:
                        futureLocation = 4;
                        return futureLocation;
                    default:
                        return 0;
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
