/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.exceptions;

/**
 *
 * @author Chicho
 */
public class MovementControlException extends Exception {

    public MovementControlException() {
    }

    public MovementControlException(String message) {
        super(message);
    }

    public MovementControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public MovementControlException(Throwable cause) {
        super(cause);
    }

    public MovementControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
    
    
}
