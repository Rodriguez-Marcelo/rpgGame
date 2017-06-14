/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.control;

import java.io.Serializable;
import slayergame.SlayerGame;
import slayergame.model.Player;

/**
 *
 * @author Chicho
 */
public class NewLocations implements Serializable{
    
    private int scenarioNumber = 0;
    private String description = "";
    private String locationName = "";
    private String choices = "";
   
    
    public NewLocations() {

    }

    public int getScenarioNumber() {
        return scenarioNumber;
    }

    public void setScenarioNumber(int scenarioNumber) {
        this.scenarioNumber = scenarioNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getChoices() {
        return choices;
    }

    public void setChoices(String choices) {
        this.choices = choices;
    }
    
    public void generateScenario(int currentLocation){
        
        switch (currentLocation){
            case 1:
                this.description = (""
                + "\nYou’re confused. You find yourself in a tank full of some "
                + "\ndense liquid. You start looking to your surroundings and "
                + "\nsee nothing more than blurs moving here and there. "
                + "\nSuddenly, red lights start to dance across the room, and "
                + "\nall the slow blurs now move frantically around you. The "
                + "\nblurs disappear, the substance is drained from the tank, "
                + "\nand you fall abruptly to the floor. The tank suddenly "
                + "\nopens, and you find yourself in some kind of advanced "
                + "\nlaboratory. Blood is splattered here and there in the "
                + "\nroom, and one other tanks seems to have exploded. Flashing "
                + "\nscreens are showing error messages, which catch your "
                + "\nattention. You see that a big, metal, heavy secured door "
                + "\nis bent on its hinges blown up. ");
                
                this.locationName = ("\nAwakening in the lab...");
                
                this.scenarioNumber = 1;
                
                this.choices = ("\n1 - Go through door"
                + "\n2 - Check dead body"
                + "\n3 - Go through window"
                + "\n4 - Check computer flashing screens"
                + "\n5 - Crawl through vent");
            case 2:
                this.description = (""
                + "\nYou walked through the door wondering what could've possibly"
                + "\nbent the hinges like that. Terrified by the stream of images"
                + "\ngoing through your mind, you snap out of your imagination"
                + "\nby the view of the hallway. Silent alarm still on, red lights"
                + "\nare flashing and circling all over the place. Sudednly, your"
                + "\nheart almost stops at the scene in front of your eyes:"
                + "\nBodies. Dead bodies wearing white coats, lying on the floor motionless, lifeless."
                + "\nYou see only one body that distinguishes itself from the rest:"
                + "\nWearing some sort of blue light armor, you guess it's a"
                + "\nsecurity guard. You also get to hear screams just across the"
                + "\ngloomy hallway. Silent alarms still on, red lights flashing "
                + "\nand circling all over the place, you see");
                this.locationName=("Hallway in full alarm");
                this.scenarioNumber=(2);
                this.choices=("\n1 - Go through stair case up"
                + "\n2 - Help trapped scientist"
                + "\n3 - Enter elevator"
                + "\n4 - Check security guard body"
                + "\n5 - Go through stair case down");
            default: 
                break;   
        }
    }
    
    public String displayScenario(){
        String allAttributes = (this.locationName + "\n\n" + this.description + 
                                "\n\n" + this.choices);
        return allAttributes;
    }
}
