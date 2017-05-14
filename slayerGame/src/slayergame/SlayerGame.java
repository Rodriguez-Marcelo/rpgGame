/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame;

import slayergame.model.Consumables;
import slayergame.model.Door;
import slayergame.model.Enemy;
import slayergame.model.Inventory;
import slayergame.model.Item;
import slayergame.model.Location;
import slayergame.model.NPC;
import slayergame.model.Player;
import slayergame.model.Room;
import slayergame.model.Weapon;

/**
 *
 * @author Chicho
 */
public class SlayerGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerOne = new Player();
        Consumables potion = new Consumables();
        Door woodDoor = new Door();
        Enemy zombie = new Enemy();
        Inventory inventoryBag = new Inventory();
        Item key = new Item();
        Location playerLocation = new Location();
        NPC vendor = new NPC();
        Room kitchen = new Room();
        Weapon sword = new Weapon();
        
        potion.setQuantity(1);
        
        woodDoor.setSturdiness(4);
        woodDoor.setType("W");
        
        zombie.setHealth(40);
        zombie.setName("ZARAZA");
        zombie.setStrength(2);
        
        inventoryBag.setSize(6);
        
        key.setDescription("A very old key");
        key.setName("Copper Key");
        key.setSizeOnInventory(0);
        key.setType("C");
        
        playerLocation.setPositionX(6);
        playerLocation.setPositionY(5);
        
        vendor.setName("Warkhos");
        
        kitchen.setPositionX(6);
        kitchen.setPositionY(5);
        
        sword.setAdditionalDamage(3);
        sword.setStrenghtReq(1);
        sword.setType("Long Sword");
        
        
        playerOne.setName("Chicho");
        playerOne.setHealth(100);
        playerOne.setStrength(1);
        playerOne.setMana(1);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        String potionInfo = potion.toString();
        System.out.println(potionInfo);
        
        String woodDoorInfo = woodDoor.toString();
        System.out.println(woodDoorInfo);
        
        String zombieInfo = zombie.toString();
        System.out.println(zombieInfo);
        
        String keyInfo = key.toString();
        System.out.println(keyInfo);
        
        String playerLocationInfo = playerLocation.toString();
        System.out.println(playerLocationInfo);
        
        String vendorInfo = vendor.toString();
        System.out.println(vendorInfo);
        
        String kitchenInfo = kitchen.toString();
        System.out.println(kitchenInfo);
        
        String swordInfo = sword.toString();
        System.out.println(swordInfo);
        
        
    }
    
}
