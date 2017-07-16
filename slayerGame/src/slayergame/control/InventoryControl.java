/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.control;

import java.io.Serializable;
import java.util.Iterator;
import slayergame.exceptions.MovementControlException;
import slayergame.model.Game;
import slayergame.model.Item;

/** Chicho & Cristian **/
public class InventoryControl implements Serializable{
    
    public Game updateInventory (int currentLocation, int choice, Game game){
        
        
        switch (currentLocation){
            case 1:
                if (choice == 2) {
                    game.inventory[Item.redIDCard.ordinal()].setFound(true);
                    return game;
                }
            case 2:
                if (choice == 4){
                    game.inventory[Item.policeBaton.ordinal()].setFound(true);
                    return game;
                }
            case 6:
                if (choice == 4){
                    game.inventory[Item.medkit.ordinal()].setFound(true);
                    return game;
                }
            case 10:
                if (choice == 2){
                    game.inventory[Item.blueIDCard.ordinal()].setFound(true);
                }
            case 13:
                if (choice == 2){
                    game.inventory[Item.securityArmour.ordinal()].setFound(true);
                }
            default:
                return game;
        }
        
        
    }
    
    public static boolean checkInventoryState (Game game){
        
        boolean allItemsFound = false;
        boolean allItemsUsed = false;
        
        if (game.inventory[Item.blueIDCard.ordinal()].isFound() &&
                game.inventory[Item.medkit.ordinal()].isFound() &&
                game.inventory[Item.redIDCard.ordinal()].isFound() &&
                game.inventory[Item.policeBaton.ordinal()].isFound() &&
                game.inventory[Item.securityArmour.ordinal()].isFound()){
            allItemsFound = true;
        }
            
        if (game.inventory[Item.blueIDCard.ordinal()].isUsed() &&
                game.inventory[Item.medkit.ordinal()].isUsed() &&
                game.inventory[Item.redIDCard.ordinal()].isUsed() &&
                game.inventory[Item.policeBaton.ordinal()].isUsed() &&
                game.inventory[Item.securityArmour.ordinal()].isUsed()){
            allItemsUsed = true;
        }    
        
        if (allItemsFound && allItemsUsed){
            return true;
        }else return false;
        
    }
}
