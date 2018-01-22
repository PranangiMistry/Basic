package com.integ.test.api;

import com.integ.test.Message;
import com.integ.test.MessageService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("messages")
public class MessageResource {

    MessageService ms=new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessage(){
        return ms.getAllMessages();
    }

    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getOneMessage(@PathParam("messageId") long messageId){

        return ms.getMessage(messageId);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Message addNewMessage(Message message){
        return ms.addMessage(message);
    }

    @PUT
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public Message updateMessage(@PathParam("messageId") long id, String NewMessage){
        Message message =new Message(id,NewMessage);
        //message.setId(id);
        return ms.updateMessage(message);
    }

    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{messageId}")
    public String deleteMessage(@PathParam("messageId") long id){
        ms.removeMessage(id);
        return "deleted succesfully";
    }
}
