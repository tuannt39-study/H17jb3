/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex9;

import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author haopv
 */
public class Server4 {
    public static void main(String[] args) {
        ServerSocket serverSock=null;
    int port=9000;int a=2;
        try {
             serverSock = new ServerSocket(8888,a);
            while(true){
                //dang cho ke tnoi toi server;
                System.out.println("Dang ket noi toi server...");
                Socket socket=serverSock.accept();
                new ThreadSocket(socket,port++).start();
                
                System.out.println("da ket noi! dang xu ly...");
                System.out.println("serversocket: "+serverSock);
                System.out.println("ten thread:  "+Thread.currentThread().getName());
                System.out.println("id thread ket noi: "+Thread.currentThread().getId());
                System.out.println("So thread: "+Thread.activeCount());
            }
        } catch (IOException ex) {
            Logger.getLogger(Server4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
