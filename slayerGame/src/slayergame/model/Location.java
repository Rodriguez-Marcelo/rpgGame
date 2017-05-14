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
public class Location {
    private int positionX;
    private int positionY;

    public Location() {
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.positionX;
        hash = 97 * hash + this.positionY;
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
        final Location other = (Location) obj;
        if (this.positionX != other.positionX) {
            return false;
        }
        if (this.positionY != other.positionY) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "positionX=" + positionX + ", positionY=" + positionY + '}';
    }
    
    
    
}
