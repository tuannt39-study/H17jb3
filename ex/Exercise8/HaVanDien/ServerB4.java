/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import tcp.tcpClient;

/**
 *
 * @author Admin
 */
public class ServerB4 {

    public static void main(String[] args) {
        try {
            ServerSocket srSk;
            String stCl;
            srSk = new ServerSocket(9000);
            Socket client = srSk.accept();
            System.out.println("Server Start...");
            BufferedReader bRCclient = new BufferedReader(new InputStreamReader(client.getInputStream()));
            DataOutputStream bOut = new DataOutputStream(client.getOutputStream());

            stCl = bRCclient.readLine();
            int arrInt[] = new int[100];
            Random rd = new Random();
            for (int j = 0; j < arrInt.length; j++) {
                arrInt[j] = rd.nextInt(100);
            }
            int min=arrInt[0];
            for(int j=0;j<arrInt.length;j++)
            {
                if(min>arrInt[j])
                {
                    min=arrInt[j];
                }
            }

            if (stCl.equals("thoat")) {
                stCl = "Tam Biet";
                bOut.writeBytes(stCl);
            } 
            else if (stCl.equals("nhonhat N")) {
                stCl= String.valueOf(min);
                bOut.writeBytes(stCl);
            }
            else {
                stCl="Sai Dinh Dang";
                bOut.writeBytes(stCl);
                
            }
            
                if (stCl != null) {
                    System.out.println("Data tu client: " + stCl);
                    stCl =""+'\n';
                    bOut.writeBytes(stCl);
                }
        } catch (IOException ex) {
            ex.printStackTrace();
            Logger.getLogger(tcpClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
