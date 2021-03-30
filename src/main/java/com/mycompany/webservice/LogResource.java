/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservice;

import bo.LogHandler;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import viewDB.LogView;

/**
 *
 * @author rami_
 */
@Path("/Log")
public class LogResource {
    
    @POST
    @Path("/add")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public boolean addLog(LogView log) {
        LogHandler lh = new LogHandler();
        return lh.addLog(log);

    }

    @GET
    @Path("/get/{email}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<LogView> getLogByEmail(@PathParam("email") String email) {
        LogHandler lh = new LogHandler();
        return lh.getLogViewsByEmail(email);

    }

}
