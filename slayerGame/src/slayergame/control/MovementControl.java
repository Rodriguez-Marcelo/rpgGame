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
    
    private int scenarioLocation = 0;

    public int getScenarioLocation() {
        return scenarioLocation;
    }

    public void setScenarioLocation(int scenarioLocation) {
        this.scenarioLocation = scenarioLocation;
    }
    
    
}
