package com.integ.test;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("profile")
public class ProfileResource {
    private ProfileService ps=new ProfileService();

//    @GET
//    @Consumes()
//    @Produces(MediaType.TEXT_PLAIN)
//    public String myprofile(){
//        return "profile page";
//    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Profile> getProfiles(){
        return ps.getAllProfile();
    }

    @GET
    @Path("/{profileName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Profile getOneProfile(@PathParam("profileName") String profileName)
    {
        return ps.getProfile(profileName);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Profile> addProfile(Profile profile)
    {
        ps.addProfile(profile);
        return ps.getAllProfile();
    }

//    @PUT
//    @Path("/{profileName}")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public List<Profile> updatesProfile(@PathParam("profileName") String pname, Profile obj){
//        Profile profile=new Profile(pname,obj);
//        ps.updateProfile(profile);
//        return ps.getAllProfile();
//    }


}
