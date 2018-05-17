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

    private String uname, upass, ugender, deptname;
    private int uid, deptid, uage;
    private long uphone;

    public User() {

    }

    public User(String uname, String upass, String ugender, int uage, long uphone, int uid, int deptid, String deptname) {
        this.uname = uname;
        this.upass = upass;
        this.ugender = ugender;
        this.uage = uage;
        this.uphone = uphone;
        this.uid = uid;
        this.deptid = deptid;
        this.deptname = deptname;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
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
