/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.model;

import java.io.Serializable;
import java.util.Objects;
/** Chicho & Cristian **/
public class Weapon implements Serializable{
    
    private String type;
    private int strenghtReq;
    private int additionalDamage;


    public Weapon() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStrenghtReq() {
        return strenghtReq;
    }

    public void setStrenghtReq(int strenghtReq) {
        this.strenghtReq = strenghtReq;
    }

    public int getAdditionalDamage() {
        return additionalDamage;
    }

    public void setAdditionalDamage(int additionalDamage) {
        this.additionalDamage = additionalDamage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.type);
        hash = 53 * hash + this.strenghtReq;
        hash = 53 * hash + this.additionalDamage;
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
        final Weapon other = (Weapon) obj;
        if (this.strenghtReq != other.strenghtReq) {
            return false;
        }
        if (this.additionalDamage != other.additionalDamage) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Weapon{" + "type=" + type + ", strenghtReq=" + strenghtReq + ", additionalDamage=" + additionalDamage + '}';
    }
    
    
    
}
