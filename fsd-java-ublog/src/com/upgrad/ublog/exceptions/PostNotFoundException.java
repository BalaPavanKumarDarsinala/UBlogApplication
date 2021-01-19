package com.upgrad.ublog.exceptions;

/**
 * TODO: 2.3. Convert this class to a custom Exception class.
 * TODO: 2.4. Provide a constructor which accepts a custom message as input
 *  parameter and passes it to its base class.
 */

public class PostNotFoundException extends Exception {
    public PostNotFoundException() {
    }

    public PostNotFoundException(String message) {
        super(message);
    }

    public PostNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PostNotFoundException(Throwable cause) {
        super(cause);
    }

    public PostNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    public static void main(String[] args) {
        try {
            throw new PostNotFoundException("Custom Message");
        } catch (PostNotFoundException e) {
            System.out.println(e.getMessage());
        }

//        /**
//         * Your output should look like this.
//         * Custom Message
//         */
    }
}
