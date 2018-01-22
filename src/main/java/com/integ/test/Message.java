package com.integ.test;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
//@XmlRootElement
public class Message {

    protected long id;
    protected String msg;
    protected Date created;
    protected String author;

    public Message(){

    }

    public Message(long id,String msg){
        this.id = id;
        this.msg = msg;
    }

    public Message(long id, String msg, String author) {
        this.id = id;
        this.msg = msg;
        this.author = author;
        this.created = new Date();
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }

    public Date getCreated() {
        return created;
    }

    public String getAuthor() {
        return author;
    }
}
