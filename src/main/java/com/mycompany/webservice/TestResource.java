/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservice;

import bo.LogHandler;
import java.util.ArrayList;
import java.util.Date;
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
@Path("/Logs")
public class TestResource {
    // This method is called if JSON is requested

    /*
    @Path ("/add")
    @Consumes({MediaType.APPLICATION_JSON})
    public boolean getLogByEmail( @PathParam("title") String title,@PathParam("text") String text,@PathParam("opEmail") String opEmail) {
        System.out.println("SSSS");
    
    	//LogHandler lh = new LogHandler();
         
        //return lh.addLog(dateAdded,   title,   text,   opEmail);
 
    	System.out.print(new LogView(new Date(), title,  text,  opEmail));
        return true;
    } */
    @POST
    @Path("/adds")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public LogView getLogByEmailSSSSSS( LogView log) {
        System.out.println("SSSS");
        /*
    	LogHandler lh = new LogHandler();
         
        return lh.addLog(dateAdded,   title,   text,   opEmail);
         */
        System.out.print( log);

        //LogView l = new LogView(new Date(), title, "fdfdsf", "fgsfgx");
        //System.out.print(l.toString());
        return  log;
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public ArrayList<LogView> getLogByEmail() {
        /*
        LogHandler lh=new  LogHandler();
        lh.addLog(new Date(), "tfdf", "gfdg", "email3");
    	return lh.getLogViewsByEmail("email3");
         */
        ArrayList<LogView> list = new ArrayList<>();
        list.add(new LogView(new Date(), "tfdf", "gfdg", "email3"));
        return list;
    }

    @GET
    @Path("/id/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public ArrayList<LogView> getLogByEmailXXRR( @PathParam("id")  int id) {
        /*
        LogHandler lh=new  LogHandler();
        lh.addLog(new Date(), "tfdf", "gfdg", "email3");
    	return lh.getLogViewsByEmail("email3");
         */
        System.out.println(id);
        ArrayList<LogView> list = new ArrayList<>();
        list.add(new LogView(new Date(), "tfdf", "gfdg", "email3"));
        return list;
    }
}
