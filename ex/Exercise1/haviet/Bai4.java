/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.io.*;
import jdk.nashorn.internal.parser.TokenType;


/**
 *
 * @author viet
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        float a,b,c,delta,x1,x2;
        String s;
        System.out.println("Giai phuong trinh bac 2 co dang a*x^2 + b*x + c = 0");
        System.out.println("Nhap he so a: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
        s = in.readLine();
        a = Float.parseFloat(s);
        System.out.println("Nhap he so b: ");
        s = in.readLine();
        b = Float.parseFloat(s);
        System.out.println("Nhap he so c: ");
        s = in.readLine();
        c = Float.parseFloat(s);
        
        delta = (float) (b*b - 4*a*c);
        if ( delta < 0 )
            System.out.println("Phuong trinh vo nghiem");
        else 
        if ( delta == 0 )
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + (-b/2*a));
        else
        if ( delta > 0 )
        {
            System.out.println("Phuong trinh co hai nghiem phan biet ");
            System.out.println("x1 = " +(float)((-b + Math.sqrt(delta))/2*a));     
            System.out.println("x2 = " +(float)((-b - Math.sqrt(delta))/2*a));  
        }
        }
            
    }
    

