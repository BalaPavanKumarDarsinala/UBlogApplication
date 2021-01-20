package com.upgrad.ublog;

public abstract class PostService {
    protected boolean isLoggedIn;

    public PostService() {
        super();
    }

    /**
     * TODO 4.7. Implement the deletePost() method. This method should prompt the user for the
     * post id. Use the deletePost() method of the PostService interface to delete the post
     * corresponding to the post id. If the post was deleted successfully (deletePost() method of
     * the PostService returns true), print the message "Post deleted successfully!" on the console.
     * If the post was not deleted successfully (deletePost() method of the PostService returns false),
     * print the message "You are not authorised to delete this post" on the console.
     * Catch all the exceptions thrown by the deletePost() method of the PostService interface with
     * a single catch block which handles all exceptions using the Exception class and print the
     * exception message using the getMessage() method.
     */
    boolean deletePost() {
        if (!isLoggedIn) {
            System.out.println("You are not logged in.");
            return false;
        }

        System.out.println("*********************");
        System.out.println("*****Delete Post*****");
        System.out.println("*********************");


        return true;
    }


}
