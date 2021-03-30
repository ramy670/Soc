/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webApiInterface;

import bo.*;
import db.Message;
import db.User;
import db.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import viewDB.LogView;
import viewDB.MessageView;
import viewDB.TrimmedUserView;
import viewDB.UserView;

/**
 *
 * @author rami_
 */
@ManagedBean(name = "userHandler", eager = true)
@SessionScoped
public class UserHandler {
/*
    private final String IP ="localhost";
    private final int PORT = 8080;

    //@Transactional??
    public boolean addUser(UserView newUser) {
        Socket socket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        Socket clientSocket = null;
        try {
            socket = new Socket(IP, PORT);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException ex) {
            Logger.getLogger(UserHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public boolean addUser(String email, String fName, String lName, String pw) {
        return addUser(new UserView(email, fName, lName, pw));
    }

    public UserView getUserViewByEmail(String email) {

        return userView;
    }

    public List<TrimmedUserView> getAllUserViewsTrimmed() {

        return trimmedUserView;
    }

    protected User getUserByEmail(String email) {

    }
*/
}
