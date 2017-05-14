/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame;

import slayergame.model.Player;

/**
 *
 * @author Chicho
 */
public class SlayerGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerOne = new Player();
        
        playerOne.setName("Chicho");
        playerOne.setHealth(100);
        playerOne.setStrength(1);
        playerOne.setMana(1);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);

    }
    
}
