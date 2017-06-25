/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Chicho
 */
public enum Scenario implements Serializable{
    
    AwakeInLab,
    HallwayInAlarm,
    InsideSecElevator,
    Basement,
    SecLockerRoom,
    HallwayToASD,
    HallwayToBioLabs,
    Bathroom,
    LoungeRoom,
    HallwayToDorms;
    
    /*
    public void scenarioGenerator(int currentLocation){
        
        switch (currentLocation){
            case 1:
                System.out.println(Scenario1);
                break;
            case 2:
                System.out.println("YA FUNCIONA JA");
        }
    }
    
     public String getScenario() {
        return scenario;
    }

    public Point getLocation() {
        return location;
    }
*/
    
}
