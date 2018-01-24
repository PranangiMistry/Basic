package com.integ.test;

/**
 * Author: mpanchal
 * Date: 1/24/18 12:45 PM
 */
public class Login {

    protected  String email;
    protected String password;

    public Login(){}

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
