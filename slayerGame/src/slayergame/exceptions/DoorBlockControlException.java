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
public class DoorBlockControlException extends Exception{

    public DoorBlockControlException() {
    }

    public DoorBlockControlException(String message) {
        super(message);
    }

    public DoorBlockControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public DoorBlockControlException(Throwable cause) {
        super(cause);
    }

    public DoorBlockControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
