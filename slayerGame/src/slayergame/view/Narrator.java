/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.view;

/**
 *
 * @author Chicho
 */
public class Narrator {
    
    public void displayDoorAnswer (int code){
        
        if (code == 0){
            /*PERFECT*/
            System.out.println("PERFECT SCORE, have this awesome sword");
        } else if (code == 1){
            /*OK*/
            System.out.println("Nice, you were close enough...");
        } else /*ERROR*/ System.out.println("Nope. Do it again.");
        
        
    }
    
    
}
