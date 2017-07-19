/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.view;

import java.io.IOException;
import java.util.Scanner;
import slayergame.SlayerGame;
import slayergame.control.GameControl;
import slayergame.control.ScenarioGenerator;
import slayergame.exceptions.GameControlExceptions;
import slayergame.exceptions.MovementControlException;
import slayergame.model.Game;

/** Chicho & Cristian **/
public class Narrator extends View {
    
    public void narrateScenario (ScenarioGenerator scenario){
        
        String locationName = scenario.getLocationName();
        String scenarioDesc = scenario.getDescription();
        String scenarioChoices = scenario.getChoices();
        
        System.out.println( locationName + "\n" + scenarioDesc + "\n"
                            + scenarioChoices );
    
    }
    
    public void displayMessage(String a){
        this.console.println(a);
    }
        
    public String getInput1() throws MovementControlException {
            
        String stringValue = "";
        try{
        stringValue = this.keyboard.readLine();
        return stringValue;
        } catch(Exception ex){ErrorView.display(displayMessage, displayMessage);}

        return stringValue;
    }
        
 
        
        
    @Override
    public boolean doAction(int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
