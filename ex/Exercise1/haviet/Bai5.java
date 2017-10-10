/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author viet
 */
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i , n = 0;
        long tong = 0 ;
        System.out.println("Nhap so nguyen duong N : ");
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String s;        
            s = in.readLine();
            n = Integer.parseInt(s);
        } catch(Exception e)
        {
            System.out.println("Nhap loi");
        }
              
        for ( i = 1 ; i <= n ; i++ )
            tong += i ;
        System.out.println("Tong cua day so tu 1 den N la : " +tong);
        
    }
    
}
