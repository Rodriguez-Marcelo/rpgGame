/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.control;

import java.io.Serializable;
import java.util.Iterator;
import slayergame.exceptions.MovementControlException;
import slayergame.model.FirearmsItem;
import slayergame.model.Game;
import slayergame.model.Guns;
import slayergame.model.Item;

/** Chicho & Cristian **/
public class GunsControl implements Serializable{
    
    public Game updateGuns (int currentGun, int choice, Game game){
        
        
        switch (currentGun){
            case 4:
                if (choice == 2) {
                    game.firearms[Guns.bazooka.ordinal()].setFound(true);
                    return game;
                }
            case 7:
                if (choice == 4){
                    game.firearms[Guns.gun.ordinal()].setFound(true);
                    return game;
                }
            case 8:
                if (choice == 4){
                    game.firearms[Guns.knife.ordinal()].setFound(true);
                    return game;
                }
            case 16:
                if (choice == 2){
                    game.firearms[Guns.ma401.ordinal()].setFound(true);
                }
            case 18:
                if (choice == 2){
                    game.firearms[Guns.rifle.ordinal()].setFound(true);
                }
            default:
                return game;
        }
        
        
    }
    
    public static boolean checkFirearmsState (Game game){
    
        boolean allGunsFound = false;
        boolean allGunsUsed = false;
        
        if (game.firearms[Guns.bazooka.ordinal()].isFound() &&
                game.firearms[Guns.gun.ordinal()].isFound() &&
                game.firearms[Guns.knife.ordinal()].isFound() &&
                game.firearms[Guns.ma401.ordinal()].isFound() &&
                game.firearms[Guns.rifle.ordinal()].isFound()){
            allGunsFound = true;
        }
            
        if (game.firearms[Guns.bazooka.ordinal()].isUsed() &&
                game.firearms[Guns.gun.ordinal()].isUsed() &&
                game.firearms[Guns.knife.ordinal()].isUsed() &&
                game.firearms[Guns.ma401.ordinal()].isUsed() &&
                game.firearms[Guns.rifle.ordinal()].isUsed()){
            allGunsUsed = true;
        }    
        
        if (allGunsFound && allGunsUsed){
            return true;
        }else return false;
        
    }
}
