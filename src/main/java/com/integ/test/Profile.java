package com.integ.test;

import javafx.scene.chart.PieChart;

import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Profile {

    protected long id;
    protected String profilrName;
    protected String firstName;
    protected String lastName;

//    public Profile(String profilrName, String firstName, String lastName) {
//        this.profilrName = profilrName;
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }

    protected Date created;

    public Profile(long id, String profilrName, String firstName, String lastName) {
        this.id = id;
        this.profilrName = profilrName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.created=new Date();
    }



    public Profile(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProfilrName() {
        return profilrName;
    }

    public void setProfilrName(String profilrName) {
        this.profilrName = profilrName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }


}
