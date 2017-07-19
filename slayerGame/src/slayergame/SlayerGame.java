/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import slayergame.control.GameControl;
import slayergame.control.InventoryControl;
import slayergame.control.MovementControl;
import slayergame.exceptions.StartProgramViewExceptions;
import slayergame.model.Consumables;
import slayergame.model.Door;
import slayergame.model.DoorBlocker;
import slayergame.model.Enemy;
import slayergame.model.Game;
import slayergame.model.Inventory;
import slayergame.model.Item;
import slayergame.model.NPC;
import slayergame.model.Player;
import slayergame.model.Room;
import slayergame.model.Weapon;
import slayergame.view.MainMenuView;
import slayergame.view.Narrator;
import slayergame.view.StartProgramView;

/** Chicho & Cristian **/
public class SlayerGame {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    
    public static void main(String[] args) {
        
        
        try{
            
            SlayerGame.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
            SlayerGame.outFile = new PrintWriter(System.out, true);
            
            String filePath = "log.txt";
            SlayerGame.logFile = new PrintWriter(filePath);
            
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView(); 
            
        } catch (Exception e){
            
            System.out.println("Exception: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
            

            
        }
        
        finally {
            
            try {
                if (SlayerGame.inFile != null)
                    SlayerGame.inFile.close();
                
                if (SlayerGame.outFile != null)
                    SlayerGame.outFile.close();
                
                if (SlayerGame.logFile != null)
                    SlayerGame.logFile.close();
                
            } catch (IOException ex) {
                Logger.getLogger(SlayerGame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

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
    
    public static PrintWriter getOutFile(){
        return outFile;
    }
    
    public static void setOutFile(PrintWriter outFile){
        SlayerGame.outFile = outFile;
    }
    
    public static BufferedReader getInFile(){
        return inFile;
    }        
    
    public static void setInFile(BufferedReader infile){
        SlayerGame.inFile = inFile;
    }
    
    public static PrintWriter getLogFile(){
        return logFile;
    }
    
    public static void setLogFile(PrintWriter logFile){
        SlayerGame.logFile = logFile;
    }
}
    

