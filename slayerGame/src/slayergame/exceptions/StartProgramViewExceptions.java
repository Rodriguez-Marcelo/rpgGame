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
public class StartProgramViewExceptions extends Exception{

    public StartProgramViewExceptions() {
    }

    public StartProgramViewExceptions(String message) {
        super(message);
    }

    public StartProgramViewExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public StartProgramViewExceptions(Throwable cause) {
        super(cause);
    }

    public StartProgramViewExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
