/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.model;

import java.io.Serializable;

/** Chicho & Cristian **/
public class InventoryItem implements Serializable{
    
    public boolean found = false;
    public boolean used = false;

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }
    
}
