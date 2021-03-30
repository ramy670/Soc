/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webApiInterface;

import bo.*;
import db.Message;
import db.User;
import java.util.Date;
import javax.persistence.EntityManager;
import viewDB.MessageView;

/**
 *
 * @author rami_
 */
public class MessageHandler {
/*
    public boolean addMessage(MessageView newMessage) {
        EntityManager em = MyEntityManagerFactory.getEntityManager();
        UserHandler uh = new UserHandler();
        User sender = uh.getUserByEmail(newMessage.getSenderEmail());
        User receiver = uh.getUserByEmail(newMessage.getReceiverEmail());
        if (sender == null || receiver == null) {
            return false;
        }
        Message msg = new Message(newMessage.getDateSent(), newMessage.getTitle(), newMessage.getText(), sender, receiver);
        em.getTransaction().begin();
        em.persist(msg);
        em.flush();
        em.getTransaction().commit();
        em.close();
        return true;

    }
    
 public boolean addMessage(Date dateSent, String title, String text,String  sender, String receiver) {
        
        return addMessage(new MessageView(dateSent,   title,   text,   sender,   receiver));

    }
    */
}
