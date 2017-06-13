/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.control;

import slayergame.SlayerGame;
import slayergame.model.Player;

/**
 *
 * @author Chicho
 */
public class NewLocations {
    
    private int scenarioNumber;
    private String description;
    private String locationName;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    private String choice5;
    
   
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
