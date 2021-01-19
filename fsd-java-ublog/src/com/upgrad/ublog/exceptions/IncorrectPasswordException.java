package com.upgrad.ublog.exceptions;

/**
 * TODO: 2.1. Convert this class to a custom Exception class.
 * TODO: 2.2. Provide a constructor which accepts a custom message as input
 *  parameter and passes it to its base class.
 */

public class IncorrectPasswordException extends Exception {
    public IncorrectPasswordException() {
    }

    public IncorrectPasswordException(String message) {
        super(message);
    }

    public IncorrectPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectPasswordException(Throwable cause) {
        super(cause);
    }

    public IncorrectPasswordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    public static void main(String[] args) {
        try {
            throw new IncorrectPasswordException("Custom Message");
        } catch (IncorrectPasswordException e) {
            System.out.println(e.getMessage());
        }

//        /**
//         * Your output should look like this.
//         * Custom Message
//         */
    }
}
