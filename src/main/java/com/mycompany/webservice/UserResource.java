/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservice;

import bo.UserHandler;
import db.User;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import viewDB.TrimmedUserView;
import viewDB.UserView;

/**
 *
 * @author rami_
 */
@Path ("/")
public class UserResource {
    
    @GET
    @Path("/getuser/{email}")
    @Produces({MediaType.APPLICATION_JSON})
    public User getUsrByEmail(@PathParam("email") String email) {
        UserHandler uh = new UserHandler();
        return uh.getUserByEmail(email);

    }
    @GET
    @Path("/get/all")
    @Produces({MediaType.APPLICATION_JSON})
    public List<TrimmedUserView> getLogByEmail() {
        UserHandler uh = new UserHandler();
        return uh.getAllUserViewsTrimmed();
    }
    @POST
    @Path("/add")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public boolean addUser(UserView usr) {
        UserHandler uh = new UserHandler();
        return uh.addUser(usr);

    }
}
