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
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import tcp.tcpClient;

/**
 *
 * @author Admin
 */
public class ClientB4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap loaclhost:");
        int a= sc.nextInt();
        
        try {
            Socket clientSk;
            System.out.println("Client Start. Mời Nhập Yêu Cầu");
            clientSk= new Socket("localhost",a);
            String inputStr,outFromSer;
            
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream outToSer= new DataOutputStream(clientSk.getOutputStream());
            BufferedReader fromSer= new BufferedReader(new InputStreamReader(clientSk.getInputStream()));
            
            inputStr =input.readLine();
            outToSer.writeBytes(inputStr+'\n');
            
            outFromSer = fromSer.readLine();
            System.out.println("chuoi tu server: "+outFromSer);
        } catch (IOException ex) {
            Logger.getLogger(tcpClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
