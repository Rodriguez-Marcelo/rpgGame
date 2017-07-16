/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.control;
import slayergame.SlayerGame;
import slayergame.exceptions.MovementControlException;
import slayergame.model.Game;
import slayergame.model.InventoryItem;
import slayergame.model.Item;
import slayergame.model.Player;
import slayergame.view.ErrorView;
import slayergame.view.Narrator;

/** Chicho & Cristian **/
public class GameControl {
   
    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        SlayerGame.setPlayer(player);
        
        return player;
    }

    public static void createNewGame(Player player) {

        
        Game game = new Game();
        SlayerGame.setCurrentGame(game);
        
        InventoryControl inventoryControl = new InventoryControl();
        
        Narrator narrator = new Narrator();
        
        game.setPlayer(player);
        
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        narrator.displayMessage("GOOD LUCK, HAVE FUN!");
        
        ScenarioGenerator scenarioGenerator = new ScenarioGenerator();
        int endExistance=0;
        for (int i = 0; i < 50 || i == 15; i++){
            
            scenarioGenerator.generateScenario(player.getCurrentLocation());
            
            narrator.narrateScenario(scenarioGenerator);
            
            int choice = narrator.getInput();
            
            game = inventoryControl.updateInventory(player.getCurrentLocation(), choice, game);
            
            endExistance++;
            MovementControl movementControler = new MovementControl();
            try{
            player.setCurrentLocation(movementControler.moveToScenario(player.getCurrentLocation(), choice));
            
            } catch (MovementControlException me){System.out.println(me.getMessage());
            }
            scenarioGenerator.generateScenario(player.getCurrentLocation());
        }
        
    }

    public static void saveGame(Player player) {
        
        Narrator narrator = new Narrator();
        narrator.displayMessage("\n\n Enter The File path for file where the game is to be saved.");
        String filePath = "";
        try{
        filePath= narrator.getInput1();
        } catch(Exception ex){ErrorView.display("MainMenuView", ex.getMessage());}
        
        
        
    }
    

    public static void loadSavedGame(Player player) {
        System.out.println("\n *** loadSavedGame() function is called ***");
    }

    public static InventoryItem[] createInventoryList() {
        InventoryItem[] inventory = new InventoryItem[5];
        
        InventoryItem redIDCard = new InventoryItem();
        redIDCard.setFound(false);
        redIDCard.setUsed(false);
        inventory[Item.redIDCard.ordinal()] = redIDCard;

        InventoryItem policeBaton = new InventoryItem();
        policeBaton.setFound(false);
        policeBaton.setUsed(false);
        inventory[Item.policeBaton.ordinal()] = policeBaton;
        
        InventoryItem medkit = new InventoryItem();
        medkit.setFound(false);
        medkit.setUsed(false);
        inventory[Item.medkit.ordinal()] = medkit;
        
        InventoryItem blueIDCard = new InventoryItem();
        blueIDCard.setFound(false);
        blueIDCard.setUsed(false);
        inventory[Item.blueIDCard.ordinal()] = blueIDCard;
        
        InventoryItem securityArmour = new InventoryItem();
        securityArmour.setFound(false);
        securityArmour.setUsed(false);
        inventory[Item.securityArmour.ordinal()] = securityArmour;
        
        return inventory;
    }

    
}
