package com.integ.test.api;

/*
* Author: Manan
* Date: 18-01-2018 13:52
*/

import com.integ.test.GetDBConnection;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloApi {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(User user) {
        return "Hello " + user.getName();
    }

//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getconnection(){
//        GetDBConnection gd=new GetDBConnection();
//        return "heloooooooo";
   // }

}
