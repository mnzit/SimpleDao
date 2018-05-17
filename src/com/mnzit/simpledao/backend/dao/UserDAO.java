/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mnzit.simpledao.backend.dao;

/**
 *
 * @author Dell
 */
import com.mnzit.simpledao.backend.model.User;
import java.sql.SQLException;
import java.util.List;
public interface UserDAO {
    int createUser(User u)throws ClassNotFoundException,SQLException;
    int updateUser(User u)throws ClassNotFoundException,SQLException;
    int deleteUser(User u)throws ClassNotFoundException,SQLException;
    List<User> allUser()throws ClassNotFoundException,SQLException;
}
