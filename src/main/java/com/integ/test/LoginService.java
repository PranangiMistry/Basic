package com.integ.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: mpanchal
 * Date: 1/24/18 12:44 PM
 */
public class LoginService {

//    GetDBConnection getDBConnection = new GetDBConnection();
//    Connection con = getDBConnection.getMyDBConnetion();
//    List<Login> list=new ArrayList<Login>();
//
//    public List<Login> getDetailsForLogin(Login login){
//     try
//     {
//        Statement stmt = con.createStatement();
//        ResultSet rs = stmt.executeQuery("select email,password from login where email=login.email and password=login.password");
//        while (rs.next())
//            System.out.println("rs");
//        {
//            list.add(new Login(rs.getString(1),rs.getString(2)));
//        }
//    }
//    catch(Exception e)
//    {
//        System.out.println(e);
//    }
//        return list;
//    }

    GetDBConnection getDBConnection = new GetDBConnection();
    Connection con = getDBConnection.getMyDBConnetion();

    Login nullLogin =new Login(null,null);
    public Login getdetailsForLogin(Login login) {
        Login userLogedin=new Login();
        System.out.println(login.getEmail());
        System.out.println(login.getPassword());
        String email=login.email.toString();
        String password=login.password.toString();
        try {
            Statement stmt = con.createStatement();

            //ResultSet rs = stmt.executeQuery("select * from login where email=' " +email + "' AND password=' " +password+"'"); problem due to space
            ResultSet rs=stmt.executeQuery("select * from login WHERE email='"+email+"'AND password='"+password+"'");
            System.out.println(rs);

            while (rs.next())
            {
                System.out.println("rs");
                    String emailid=rs.getString(1);
                    String pwd= rs.getString(2);
                System.out.println("rsrsrsrsrsrsrsrsrsrsrrsrs");
                 userLogedin.setEmail(email);
                 userLogedin.setPassword(pwd);
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                return  userLogedin;

            }
        }
        catch (Exception e){
            System.out.println(e);
            //return nullLogin;
        }
        finally {
            return userLogedin;
        }

    }
}