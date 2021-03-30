/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservice;

import bo.MessageHandler;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import viewDB.MessageView;

/**
 *
 * @author rami_
 */
@Path ("/Msg")
public class MessageResource {
    @POST
    @Path("/add")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public boolean addMessage(MessageView msg) {
        MessageHandler mh = new MessageHandler();
        return mh.addMessage(msg);

    }
    
}
