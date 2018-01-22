package com.integ.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProfileService {

    public ProfileService() {
        profiles.put("pari",new Profile(1l,"pari","Pari","Mistry"));
        profiles.put("Jay",new Profile(2l,"Jay","Jay","Mistry"));
        profiles.put("Nishant",new Profile(3l,"Nishant","Nishant","Vaja"));
    }


    private static Map<String,Profile> profiles =DataBase.getProfiles();

    public List<Profile> getAllProfile(){
        List<Profile> list=new ArrayList<Profile>(profiles.values());
        return list;
    }

    public Profile getProfile(String profileName){
        return profiles.get(profileName);
    }

    public Profile addProfile(Profile profile){
        profile.setId(profiles.size()+1);
        profiles.put(profile.getProfilrName(),profile);
        return profile;
    }

    public Profile updateProfile(Profile profile)
    {
        if(profile.getProfilrName()==null) {
            return null;
        }
        profiles.put(profile.getProfilrName(),profile);
        return profile;
    }

    public Profile removeProfile(String profileName){
        return profiles.remove(profileName);
    }

}
