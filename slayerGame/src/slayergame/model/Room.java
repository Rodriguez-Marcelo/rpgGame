/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.model;

import java.io.Serializable;
import java.util.Objects;
/** Chicho & Cristian **/
public class Room {
    
    private int positionX;
    private int positionY;
    private int size;

    public Room() {
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.positionX;
        hash = 79 * hash + this.positionY;
        hash = 79 * hash + this.size;
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
        final Room other = (Room) obj;
        if (this.positionX != other.positionX) {
            return false;
        }
        if (this.positionY != other.positionY) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Room{" + "positionX=" + positionX + ", positionY=" + positionY + ", size=" + size + '}';
    }
    
    
    
    
    
    
}
