package com.upgrad.ublog.exceptions;

/**
 * TODO: 2.7. Convert this class to a custom Exception class.
 * TODO: 2.8. Provide a constructor which accepts a custom message as input
 *  parameter and passes it to its base class.
 */

public class UserNotFoundException extends Exception{
    public UserNotFoundException() {
    }

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotFoundException(Throwable cause) {
        super(cause);
    }

    public UserNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
   public static void main(String[] args) {
        try {
            throw new UserNotFoundException("Custom Message");
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }

//        /**
//         * Your output should look like this.
//         * Custom Message
//         */
   }
}
