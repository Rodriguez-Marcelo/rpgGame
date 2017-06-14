/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame;

import java.util.Scanner;
import slayergame.control.DoorSphingeControl;
import slayergame.control.GameControl;
import slayergame.control.InventoryControl;
import slayergame.control.MovementControl;
import slayergame.control.NewLocations;
import slayergame.model.Consumables;
import slayergame.model.Door;
import slayergame.model.DoorBlocker;
import slayergame.model.Enemy;
import slayergame.model.Game;
import slayergame.model.Inventory;
import slayergame.model.Item;
import slayergame.model.Location;
import slayergame.model.NPC;
import slayergame.model.Player;
import slayergame.model.Room;
import slayergame.model.Weapon;
import slayergame.view.MainMenuView;
import slayergame.view.Narrator;
import slayergame.view.StartProgramView;
import slayergame.view.MoveToView;

/**
 *
 * @author Chicho
 */
public class SlayerGame {

    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        
        GameControl gameControl = new GameControl();
        InventoryControl inventoryControl = new InventoryControl();
        
        NewLocations scenario1 = null, scenario2 = null, scenario3, 
                scenario4, scenario5, scenario6, 
                scenario7, scenario8, scenario9, 
                scenario10, scenario11, scenario12, 
                scenario13, scenario14, scenario15, 
                scenario16, scenario17, scenario18, 
                scenario19, scenario20, scenario21,
                scenario22, scenario23, scenario24,
                scenarioFinal
                = new NewLocations();        
        
        
        scenario1.setDescription(""
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
        scenario1.setLocationName("Awakening in the lab...");
        scenario1.setScenarioNumber(1);
        scenario1.setChoice1("1 - Go through door");
        scenario1.setChoice2("2 - Check dead body");
        scenario1.setChoice3("3 - Go through window");
        scenario1.setChoice4("4 - Check computer flashing screens");
        scenario1.setChoice5("5 - Crawl through vent");
        
        scenario2.setDescription(""
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
        scenario2.setLocationName("");
        scenario2.setScenarioNumber(2);
        scenario2.setChoice1("");
        scenario2.setChoice2("");
        scenario2.setChoice3("");
        scenario2.setChoice4("");
        scenario2.setChoice5("");
        
                
        
        Item policeBaton, redID, blueID, securityArmor, medKit = new Item();
        
        NPC evaConnor = new NPC();
        
        DoorBlocker doorBlock1 = new DoorBlocker();
        DoorBlocker doorBlock2 = new DoorBlocker();
        DoorBlocker doorBlock3 = new DoorBlocker();
        
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SlayerGame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SlayerGame.player = player;
    }
    
}
