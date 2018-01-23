package com.integ.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MessageService {

    public MessageService(){
        messages.put(1l,new Message(1,"Hello from pari","Pari"));
        messages.put(2l,new Message(2,"Hello from jay","jay"));
        messages.put(3l,new Message(3,"Helllo From nishant" , "Nishant"));
    }

    private Map<Long,Message> messages= DataBase.getMessages();

    public List<Message> getAllMessages(){
      List<Message> list=new ArrayList<Message>(messages.values());
      return list;
    }

    public Message getMessage(long id){
        return messages.get(id);
    }

    public Message addMessage(Message message){
        message.setId(messages.size()+1);
        messages.put(message.getId(),message);
        return message;
    }

    public Message updateMessage(Message message)
    {
        if(message.getId()<=0) {
            return null;
        }
        messages.put(message.getId(),message);
        return message;
    }

    public Message removeMessage(long id){
        return messages.remove(id);
    }

}
