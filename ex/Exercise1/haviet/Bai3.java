/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;


/**
 *
 * @author viet
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        float a,b,x;
        String s;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Giai phuong trinh bac nhat a*x + b = 0");               
        System.out.println("Nhap a: ");
        s = in.readLine();
        a = Float.parseFloat(s);
        System.out.println("Nhap b: ");
        s = in.readLine();
        b = Float.parseFloat(s);
        if ( a ==0 )
            System.out.println("Phuong trinh bac nhat vo nghiem");
        else
            System.out.println("Phuong trinh co nghiem x = " +(-b/a));
         
        
                
        
    }
    
}
