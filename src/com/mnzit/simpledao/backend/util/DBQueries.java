/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mnzit.simpledao.backend.util;

/**
 *
 * @author Dell
 */
public class DBQueries {
    public static final String INSERT = "INSERT INTO "+DBTables.USER_TABLE+" (u_name,u_password,u_gender) VALUES(?,?,?)";
    public static final String RETRIEVE_ALL = "SELECT * FROM "+DBTables.USER_TABLE;
}
