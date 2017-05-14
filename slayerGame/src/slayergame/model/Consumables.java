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
 * @author creestian
 */
public class Consumables implements Serializable{
    
    private int quantity;

    public Consumables() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.quantity;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Consumables other = (Consumables) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Consumables{" + "quantity=" + quantity + '}';
    }

    
    
    
}
