/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mnzit.simpledao.backend.dao.daoImpl;

/**
 *
 * @author Dell
 */
import com.mnzit.simpledao.backend.dao.UserDAO;
import com.mnzit.simpledao.backend.model.User;
import com.mnzit.simpledao.backend.util.DBFunc;
import com.mnzit.simpledao.backend.util.DBQueries;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    private DBFunc db = new DBFunc();
    private PreparedStatement pstm = null;
    private ResultSet rs = null;
    public int createUser(User u)throws ClassNotFoundException,SQLException{
        db.connect();
        pstm = db.preparedStm(DBQueries.INSERT);
//        pstm.setInt(1,u.getUid());
        pstm.setString(1,u.getUname());
        pstm.setString(2,u.getUpass());
        pstm.setString(3,u.getUgender());
        db.update();
        int currentInsertID = db.insertedUid();
        System.out.println(currentInsertID);
        db.close();
        return 0;
  
    }
    public int updateUser(User u){
        return 0;
    }
    public int deleteUser(User u){
        return 0;
    }
    public List<User> allUser()throws ClassNotFoundException, SQLException{
        List<User> allUsers = new ArrayList<>();
        db.connect();
        pstm = db.preparedStm(DBQueries.RETRIEVE_ALL);
        rs = db.retrieve();
        while(rs.next()){
            User u = new User();
            u.setUid(rs.getInt("u_id"));
            u.setUname(rs.getString("u_name"));
            u.setUpass(rs.getString("u_password"));
            u.setUgender(rs.getString("u_gender"));
            allUsers.add(u);
        }
        db.close();
        return allUsers;
    }
}
