package com.integ.test;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.List;

/**
 * Author: mpanchal
 * Date: 1/24/18 12:47 PM
 */
@Path("login")
public class LoginResource {

    LoginService ls=new LoginService();
    Login logineduser =new Login();
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String login(Login login){

        logineduser=ls.getdetailsForLogin(login);
        System.out.println("fjgfhjghvnghdhgcnvnbjgjhbmnbm");
        System.out.println(logineduser.email);
        System.out.println(logineduser.password);

        if(logineduser.email=="admin"){
            return "admin";
        }
        else {
            return logineduser.email;
        }
//        if(login.email=="admin"){
//            if(login.password=="admin"){
//                return "admin";
//            }
//            else {
//                return "password is wrong";
//            }
//        }
//        else{
//            return "normal user";
//        }
        //return ls.getDetailsForLogin(login.email,login.password);
    }
}
