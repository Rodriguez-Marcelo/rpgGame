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
    private String choice1 = "";
    private String choice2 = "";
    private String choice3 = "";
    private String choice4 = "";
    private String choice5 = "";

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

    public String getChoice1() {
        return choice1;
    }

    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }

    public String getChoice2() {
        return choice2;
    }

    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    public String getChoice3() {
        return choice3;
    }

    public void setChoice3(String choice3) {
        this.choice3 = choice3;
    }

    public String getChoice4() {
        return choice4;
    }

    public void setChoice4(String choice4) {
        this.choice4 = choice4;
    }

    public String getChoice5() {
        return choice5;
    }

    public void setChoice5(String choice5) {
        this.choice5 = choice5;
    }
    
   
    public static void moveToPathA(Player player) {
        System.out.println("\n *** moveToPathA() function is called ***");
    }

    public static void moveToPathB(Player player) {
        System.out.println("\n *** moveToPathB() function is called ***");
    }

    public static void moveToPathC(Player player) {
        System.out.println("\n *** moveToPathC() function is called ***");
    }

    public static void moveToPathD(Player player) {
        System.out.println("\n *** moveToPathD() function is called ***");
    }
    
    public static void moveToPathE(Player player) {
        System.out.println("\n *** moveToPathE() function is called ***");
    }
}
