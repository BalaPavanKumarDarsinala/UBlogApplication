package com.upgrad.ublog.dao;

/**
 * TODO: 3.8. Provide a factory method which returns PostDAOImpl object. (Hint: Return type
 *  of this method should be PostDAO)
 * TODO: 3.9. Provide a factory method which returns UserDAOImpl object. (Hint: Return type
 *  of this method should be UserDAO)
 */

public class DAOFactory {
public PostDAO getPostDao(){
    return PostDAOImpl.getInstance();
}

    public DAOFactory() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public UserDAO getUserDAO(){
    return UserDAOImpl.getUser();
}
}
