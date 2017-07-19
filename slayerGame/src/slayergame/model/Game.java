/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.model;

/** Chicho & Cristian **/
public class Game {
    
    public Player player;
    public DoorBlocker doorBlock1, doorBlock2, doorblock3;
    public InventoryItem[] inventory;
    public FirearmsItem [] firearms;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public DoorBlocker getDoorBlock1() {
        return doorBlock1;
    }

    public void setDoorBlock1(DoorBlocker doorBlock1) {
        this.doorBlock1 = doorBlock1;
    }

    public DoorBlocker getDoorBlock2() {
        return doorBlock2;
    }

    public void setDoorBlock2(DoorBlocker doorBlock2) {
        this.doorBlock2 = doorBlock2;
    }

    public DoorBlocker getDoorblock3() {
        return doorblock3;
    }

    public void setDoorblock3(DoorBlocker doorblock3) {
        this.doorblock3 = doorblock3;
    }

    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }
    
    public FirearmsItem[] getFirearms() {
        return firearms;
    }

    public void setFirearms(FirearmsItem[] firearms) {
        this.firearms = firearms;
    }
}
