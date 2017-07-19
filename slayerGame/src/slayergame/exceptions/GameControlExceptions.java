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
public class GameControlExceptions extends Exception{

    public GameControlExceptions() {
    }

    public GameControlExceptions(String message) {
        super(message);
    }

    public GameControlExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public GameControlExceptions(Throwable cause) {
        super(cause);
    }

    public GameControlExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}