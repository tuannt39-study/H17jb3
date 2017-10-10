/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex9;

import java.io.*;
import java.net.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author haopv
 */
public class ThreadSocket extends Thread  {
    
    int port;
    Socket socket =null;
    BufferedReader fromClient=null;
    public ThreadSocket (Socket socket,int port ){
        this.socket = socket;
        this.port=port;
        System.out.println("tao ket noi toi client: "+this.port+ " at: "+socket.toString());
    }
    
    
    
    
    
    public String xuly(String s) {
        //mang so nguyen a
        //lay so nho nhat trong mang so nguyen a
        //out ra so nho nhat duoi dang string
        //neu khong phai thi tra lai tring sai ding dang
        //String mau = "(nhonhat) \\s\\d{1}";
        String mau1 = "nhonhat \\d+";
        String mau2 = "nhonhat \\d+\\s";
        if ("thoat".equals(s)) {
            return "thoat";
        } else if (s.matches(mau1) || s.matches(mau2)) {
            String a[] = s.split(" ");
            int c=Integer.parseInt(a[1]);
            int min = 1000;
            int mang[]= new int[c];
            Random m = new Random();
            int b = m.nextInt(1000);
            for(int i=0;i<c;i++){
                mang[i]=b;
                if(min>mang[i]){
                    min=mang[i];
                }
            }
            
            return "KETQUA: "+min;
        }else return "sai dinh dang";

    }
    public void run(){
        try {
            PrintStream ps = new PrintStream(socket.getOutputStream());
             fromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while(true){
                String mesFromClient = fromClient.readLine();//chuoi nhan duoc tu client;
                System.err.println("client: "+mesFromClient);
                if("thoat".equals(mesFromClient)){
                    String mes = "tam biet!";
                    ps.println(mes);
                    break;
                }
                String mesToClient = xuly(mesFromClient);
                ps.println(mesToClient);
                System.out.println("ten cua thread dang chay: "+Thread.currentThread().getName());
                System.out.println("id cua thread dang chay: "+Thread.currentThread().getId());
                
            }
        } catch (IOException ex) {
            Logger.getLogger(ThreadSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
