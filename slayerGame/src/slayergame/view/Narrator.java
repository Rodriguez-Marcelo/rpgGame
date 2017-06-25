/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.view;

import java.util.Scanner;
import slayergame.SlayerGame;
import slayergame.control.GameControl;
import slayergame.control.ScenarioGenerator;

/** Chicho & Cristian **/
public class Narrator extends View {
    
    public void narrateScenario (ScenarioGenerator scenario){
        
        String locationName = scenario.getLocationName();
        String scenarioDesc = scenario.getDescription();
        String scenarioChoices = scenario.getChoices();
        
        System.out.println( locationName + "\n" + scenarioDesc + "\n"
                            + scenarioChoices );

    }

    @Override
    public boolean doAction(int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
