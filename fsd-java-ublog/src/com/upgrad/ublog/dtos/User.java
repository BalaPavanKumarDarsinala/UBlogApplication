package com.upgrad.ublog.dtos;

/**
 * TODO: 1.8. Declare 3 private instance variables in this class named as
 *  userId, emailId and password. Out of these 3 variables, userId will be of
 *  type int. Other two variables will be of type String.
 *
 * TODO: 1.9. Provide getters and setters for each of the instance variables. Also,
 *  provide a no-arg constructor and a parameterized constructor to create objects
 *  of User class.
 *
 * Note: Uncomment the toString() method given below, instead of writing a new one.
 */

public class User {
    public int postId;
    public int userId;
  public   String emailId,Password;
    public String tag;
    public String title;
    public String description;

    public User(int userId, String emailId, String password) {
        this.userId = userId;
        this.emailId = emailId;
        Password = password;
    }

    public User() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", emailId='" + emailId + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public static void main(String[] args) {
        User user = new User();
        user.setUserId(1);
       user.setEmailId("dummy@dummy.com");
        user.setPassword("password");

        System.out.println(user);
//
//        /**
//         * Your output should be similar to this.
//         * User{userId=1, emailId='dummy@dummy.com', password='password'}
//         */
    }
}

 
