/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame;

import java.util.Scanner;
import slayergame.control.DoorSphingeControl;
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
import slayergame.view.Narrator;

/**
 *
 * @author Chicho
 */
public class SlayerGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
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
        */
        
        Narrator narrator = new Narrator();
        DoorSphingeControl doorSphingeControl = new DoorSphingeControl();
        Scanner inFile;
        inFile = new Scanner(System.in);
        
        
        /*
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
        */
        
        /*---------------------------------------------------------------------*/
        
        /*VALUE INPUT - CONE SURFACE AREA */
        System.out.println("CALC CONE SA");
        System.out.println("Enter the radius:");
        double radius = inFile.nextDouble();
        System.out.println("Enter the length:");
        double lenght = inFile.nextDouble();
        
        /*FUNCTION CALLS - ANSWER DISPLAY - CONE SURFACE AREA*/
        double totalSA = doorSphingeControl.calcConeSA(radius, lenght);
        int answerCode = doorSphingeControl.selectDoorAnswerCone(totalSA);
        narrator.displayDoorAnswer(answerCode);
  
        /*---------------------------------------------------------------------*/
        
        /*VALUE INPUT - RECTANGLE PERIMETER */
        System.out.println("CALC RECTANGLE PERIMETER");
        System.out.println("Enter the lenght:");
        int lengthCube = inFile.nextInt();
        System.out.println("Enter the height:");
        int height = inFile.nextInt();
        
        /*FUNCTION CALLS - ANSWER DISPLAY - RECTANGLE PERIMETER*/
        int totalPer = doorSphingeControl.calcRectanglePer(height, lengthCube);
        int answerCodeCube = doorSphingeControl.selectDoorAnswerRectangle(totalPer);
        narrator.displayDoorAnswer(answerCodeCube);
        
        /*---------------------------------------------------------------------*/
        
        /*VALUE INPUT - CONE VOLUME */
        System.out.println("CALC CONE VOLUME");
        System.out.println("Enter the radius:");
        double radiusVol = inFile.nextInt();
        System.out.println("Enter the height:");
        double heightVol = inFile.nextInt();
        
        /*FUNCTION CALLS - ANSWER DISPLAY - CONE VOLUME*/
        double totalVol = doorSphingeControl.calcConeVol(radiusVol, heightVol);
        int answerCodeVol = doorSphingeControl.selectDoorAnswerVol(totalVol);
        narrator.displayDoorAnswer(answerCodeVol);
        
    }
    
}
