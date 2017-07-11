/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.view;

import java.io.PrintWriter;
import slayergame.SlayerGame;
import static slayergame.SlayerGame.getOutFile;

/**
 *
 * @author creestian
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = getOutFile();
    private static final PrintWriter logFile = SlayerGame.getLogFile();
    
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
        "+----------------------------------------------+"
        + "\n- ERROR - " + errorMessage
        + "\n +----------------------------------------------+"
        );
        
        logFile.println(className + " - " + errorMessage);
        
    }
    
}
