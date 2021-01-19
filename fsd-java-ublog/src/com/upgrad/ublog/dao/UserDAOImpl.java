package com.upgrad.ublog.dao;

import com.upgrad.ublog.dtos.User;

import java.sql.SQLException;

/**
 * TODO: 3.5. Implement the UserDAO interface and implement this class using the Singleton pattern.
 *  (Hint: Should have a private no-arg Constructor, a private static instance attribute of type
 *  UserDAOImpl and a public static getInstance() method which returns the instance attribute.)
 * TODO: 3.6. findByEmailId() method should take email id as an input parameter and
 *  return the user details corresponding to the email id from the USER table defined
 *  in the database. (Hint: You should get the connection using the Database class)
 * TODO: 3.7. create() method should take user details as input and insert these details
 *  into the USER table. Return the same User object which was passed as an input
 *  argument. (Hint: You should get the connection using the Database class)
 */

public abstract class UserDAOImpl implements UserDAO {
    private static  UserDAOImpl userDAO;
    private Object User;

    public UserDAOImpl() {
    }

    public UserDAOImpl userDAO(){
        if(userDAO==null){
            return userDAO();
        }
        else  return userDAO;
    }
    private static UserDAOImpl getUserDAO(){
        return userDAO;
    }

    public static Object getUser() {
        return User;
    }

    public void setUser(Object user) {
        User = user;
    }

    public static void setUserDAO(UserDAOImpl userDAO) {
        UserDAOImpl.userDAO = userDAO;
    }

    public String findByEmailId(){
        Object temp = new Object();
        return (String) User;
    }
public User create(){
        return new User();
}

  public static void main(String[] args) {
      try {
            UserDAO userDAO = new UserDAOImpl() {
                @Override
                public String create(User user) throws SQLException {
                    return null;
                }

                @Override
                public UserDAOImpl findByEmailId(String emailId) throws SQLException {
                    return null;
                }
            };
            User temp = new User();
            temp.setUserId(1);
            temp.setEmailId("temp@temp.temp");
            temp.setPassword("temp");
            userDAO.create(temp);
            System.out.println(userDAO.findByEmailId("temp@temp.temp"));
        } catch (Exception e) {
            System.out.println("FAILED");
        }

//        /**
//         * Following should be the desired output of the main method.
//         * User{userId=11, emailId='temp@temp.temp', password='temp'}
//         */
    }
}
