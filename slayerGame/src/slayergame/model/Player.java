/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Chicho
 */
public class Player implements Serializable{
    
    private String name;
    private Inventory inventory;
    private int currentLocation;
    

    public Player() {
        this.currentLocation = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }

    
    
}
