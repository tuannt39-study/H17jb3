/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex9;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author haopv
 */
public class Client4 {
    static int nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số thứ tự của sinh viên: ");
        int a = 0;
        boolean check = true;
        do {
            try {
                a = scan.nextInt();
                check = false;
            } catch (Exception e) {
                System.out.print("nhập lại:");
                scan.nextLine();
            }

        } while (check == true);
        return a;
    }

    public static void main(String[] args) {
        String mesSend;
        String mesReceive;
        try {
            Scanner nhap = new Scanner(System.in);
            int so=nhap();
            int port =9000+so;
            
            
            Socket socket = new Socket("localhost", 8888,InetAddress.getByName("localhost"),port);
            System.out.println("OK. chào sinh viên số: "+ so+" đã kết nối tới Server! ");
            System.out.println("cong ket noi: "+socket);
            
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream ps = new PrintStream(socket.getOutputStream());
            System.out.println("Nhap 1 dong yeu cau mau: \"nhonhat N\" hoac thoat");
            System.out.print("Gui sang server: ");
            while (true) {

                mesSend = nhap.nextLine();
                ps.println(mesSend);
                
                mesReceive = inFromServer.readLine();
                if("tam biet!".equals(mesReceive)){
                System.err.println("server: " + mesReceive);
                    break;
                }else
                System.err.println("server: " + mesReceive);
            }
        } catch (IOException ex) {
            Logger.getLogger(Client4.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
