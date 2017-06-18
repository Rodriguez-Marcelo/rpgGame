/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.model;

import java.io.Serializable;
import java.util.Objects;

/** Chicho & Cristian **/
public class Door implements Serializable{
    
    private int sturdiness;
    private String type;

    public Door() {
    }

    public int getSturdiness() {
        return sturdiness;
    }

    public void setSturdiness(int sturdiness) {
        this.sturdiness = sturdiness;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Door{" + "sturdiness=" + sturdiness + ", type=" + type + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + this.sturdiness;
        hash = 31 * hash + Objects.hashCode(this.type);
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
        final Door other = (Door) obj;
        if (this.sturdiness != other.sturdiness) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
    
    
}
