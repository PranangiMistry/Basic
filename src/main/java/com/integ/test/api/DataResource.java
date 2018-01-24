package com.integ.test.api;

import com.integ.test.Data;
import com.integ.test.DataService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//import java.awt.*;
import java.util.List;
/**
 * Author: mpanchal
 * Date: 1/24/18 12:20 PM
 */
@Path("mydbdata")
public class DataResource {
    DataService ds=new DataService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Data> getAllData(){
            return ds.getAllData();
    }

}
