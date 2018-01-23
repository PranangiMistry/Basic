package com.integ.test;

//import java.awt.*;
import java.sql.*;
import java.util.*;

/**
 * Author: mpanchal
 * Date: 1/23/18 5:18 PM
 */
//@Path("mydbdata")
public class GetAllData {

    //    GetDBConnection getDBConnection=new GetDBConnection();
//
//    Connection con=getDBConnection.getMyDBConnetion();
//
//    Statement st;
//    ResultSet rs;
//    int id,isStd;
//    String fname,lname;
//    Data mydata=new Data();
//    //Data[] dataarr = new Data[] {};
//    //ArrayList<Data> alldata=new ArrayList<Data>();
//    ArrayList<Data> alldata = new ArrayList<Data>();
//    //List<ArrayList<Data>> list=new ArrayList<ArrayList<Data>>();
//    ArrayList<Data> dataofone = new ArrayList<Data>(Arrays.asList(mydata));
//    public ArrayList<Data>  getData(){
//        try{
//            st=con.createStatement();
//            rs=st.executeQuery("select * from std");
//
//            while (rs.next()){
//
//                //id=rs.getInt(1);
//                System.out.println(rs.getInt(1));
//                mydata.setId(rs.getInt(1));
//                //fname=rs.getString(2);
//                mydata.setFname(rs.getString(2));
//                //lname=rs.getString(3);
//                mydata.setLname(rs.getString(3));
//                //isStd=rs.getInt(4);
//                mydata.setIsStd(rs.getInt(4));
//                //return data;
////                System.out.println(data);
////                listdata.add(data);
////                System.out.println(list);
////                list.add(listdata);
//                dataofone.add(mydata);
//                alldata.add(mydata);
//            }
//
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        //return data;
//        return dataofone;
//    }
//
////    @GET
////    @Produces(MediaType.APPLICATION_JSON)
////    public List<Data> connectionDB(){
////        mylist
////        return list;
////    }
    public Object getData() {
        GetDBConnection getDBConnection = new GetDBConnection();
        Connection con = getDBConnection.getMyDBConnetion();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from std");
            Object[] obj = new Object[]{};
            ArrayList<Object> fo = new ArrayList<Object>(Arrays.asList(obj));

            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4));
                ArrayList<Object> newObj = new ArrayList<Object>(Arrays.asList(obj));
                newObj.add(rs.getInt(1));
                newObj.add(rs.getString(2));
                newObj.add(rs.getString(3));
                newObj.add(rs.getString(4));
                fo.add(newObj);
            }
            con.close();
            return fo;
        } catch (Exception e) {
            return e;
        }
    }
}
