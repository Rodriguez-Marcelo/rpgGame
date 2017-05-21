/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.control;

/**
 *
 * @author Chicho
 */

public class DoorSphingeControl {
    
    private double radiusCone;
    private double lengthCone;
    
    public double calcConeSA (double radius, double length){
        
        /*
        - Parameter limit - 
        
        input ok min 5
        input ok max 15
        input perfect 10
        
        
        - total >= 109.8 ok
        - total = 376.9911184307752 PERFECT
        - total <=  801.2 ok
        
        */
        
        double totalSA = ( Math.PI * radius * 2 ) + (Math.PI * radius * length);
        
        return totalSA;
    }
    
    public int selectDoorAnswerCone (double totalSA){
        int code = 0;
        
        
        if (totalSA == 376.9911184307752){
            /*PERFECT*/
            code = 0;
        } else if (totalSA <= 801.2 && totalSA >= 109.8){
            /*OK*/
            code = 1;
        } else code = 2; /*ERROR*/
        
        return code;
    }
            
    
    
}
