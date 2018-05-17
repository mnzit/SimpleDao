/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mnzit.simpledao.backend.model;

/**
 *
 * @author Dell
 */
public class User {

    private String uname, upass, ugender;
    private int uid, uage;
    private long uphone;

    public User() {

    }

    public User(String uname, String upass, String ugender, int uage, long uphone, int uid) {
        this.uname = uname;
        this.upass = upass;
        this.ugender = ugender;
        this.uage = uage;
        this.uphone = uphone;
        this.uid = uid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getUgender() {
        return ugender;
    }

    public void setUgender(String ugender) {
        this.ugender = ugender;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    public long getUphone() {
        return uphone;
    }

    public void setUphone(int uphone) {
        this.uphone = uphone;
    }

}
