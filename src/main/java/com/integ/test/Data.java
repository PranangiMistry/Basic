package com.integ.test;

/**
 * Author: mpanchal
 * Date: 1/23/18 6:22 PM
 */
public class Data {

    public Data(){}
    public Data(int id, int isStd, String fname, String lname) {
        this.id = id;
        this.isStd = isStd;
        this.fname = fname;
        this.lname = lname;
    }

    protected int id,isStd;
    protected String fname,lname;

    public int getIsStd() {
        return isStd;
    }

    public void setIsStd(int isStd) {
        this.isStd = isStd;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
