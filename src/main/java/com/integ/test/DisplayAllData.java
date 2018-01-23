package com.integ.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: mpanchal
 * Date: 1/23/18 6:57 PM
 */
@Path("mydbdata")
public class DisplayAllData {
    GetAllData getAllData=new GetAllData();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Object display(){
        return getAllData.getData();
    }

}

