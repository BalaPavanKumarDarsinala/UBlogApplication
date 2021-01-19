package com.upgrad.ublog.dao;

import com.upgrad.ublog.dtos.User;

import java.sql.SQLException;

public interface UserDAO {
    public String create(User user) throws SQLException;
    public UserDAOImpl findByEmailId(String emailId) throws SQLException;
}
