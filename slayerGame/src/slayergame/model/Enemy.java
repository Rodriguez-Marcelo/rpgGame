/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.model;

import java.io.Serializable;
import java.util.Objects;
/** Chicho & Cristian **/
public class Enemy implements Serializable{
    
    private String name;
    private int health;
    private int strength;

    public Enemy() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Enemy{" + "name=" + name + ", health=" + health + ", strength=" + strength + '}';
    }
    
}
