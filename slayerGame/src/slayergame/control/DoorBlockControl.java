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
public class DoorBlockControl {
    
    public String blockDesc = "";
    public String input1 = "";
    public String input2 = "";
    
    public double coneKeyCalc (double radius, double length){
        
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
        totalSA = Math.round( totalSA * 100.0 ) / 100.0;
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
            
    /*RECTANGLE PERIMETER - DOOR CALCULATIONS*/
    public int calcRectanglePer (int length , int height){
        
        /*
        - Parameter limit - 
        
        input ok min 5
        input ok max 15
        input perfect 10
        
        
        - total >= 20 ok
        - total = 40 PERFECT
        - total <= 60 ok
        
        */
        
        int totalPer = ( 2 * length) + ( 2 * height);
        
        return totalPer;
    }
    public int selectDoorAnswerRectangle (double totalPer){
        int code = 0;
        
        
        if (totalPer == 40){
            /*PERFECT*/
            code = 0;
        } else if (totalPer <= 60 && totalPer >= 20){
            /*OK*/
            code = 1;
        } else code = 2; /*ERROR*/
        
        return code;
    }

    /*CONE VOLUME - DOOR CALCULATIONS*/
    public double calcConeVol(double radiusVol, double heightVol) {
        
        /*
        - Cone limit - 
        
        input ok min 5
        input ok max 15
        input perfect 10
        
        
        - total >= 130.7 ok
        - total = 1047.1975511965 Perfect
        - total <= 3534.3 ok
        
        */
        
        
        double totalVol = (Math.PI * (Math.pow(radiusVol, 2)) * heightVol ) / 3;
        totalVol = Math.round( totalVol * 100.0 ) / 100.0;
        return totalVol;
    } 
    public int selectDoorAnswerVol (double totalVol){
        int code = 0;
        
        
        if (totalVol == 1047.1975511965977){
            /*PERFECT*/
            code = 0;
        } else if (totalVol <= 3534.3 && totalVol >= 130.7){
            /*OK*/
            code = 1;
        } else code = 2; /*ERROR*/
        
        return code;
    }
    
}
