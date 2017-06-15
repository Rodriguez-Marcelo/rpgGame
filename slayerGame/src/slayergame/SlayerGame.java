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
