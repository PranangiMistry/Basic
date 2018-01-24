package com.integ.test;

import javassist.bytecode.stackmap.BasicBlock;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: mpanchal
 * Date: 1/24/18 12:08 PM
 */
public class DataService
{
    GetDBConnection getDBConnection = new GetDBConnection();
    Connection con = getDBConnection.getMyDBConnetion();
    //Data data=new Data();
    public List<Data> getAllData(){
        List<Data> list=new ArrayList<Data>();
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from std");
            while (rs.next()) {
                list.add(new Data(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return list;
    }

}
