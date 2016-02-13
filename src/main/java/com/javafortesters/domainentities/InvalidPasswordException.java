package com.javafortesters.domainentities;

/**
 * Created by jss on 13-2-16.
 */
public class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
