/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author viet
 */
public class Bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i , n =0 ;      
        long giaithua ;
        System.out.println("Nhap so nguyen N : ");
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String s;        
            s = in.readLine();
            n = Integer.parseInt(s);
        } catch(Exception e)
        {
            System.out.println("Khong hop le");
        }
        giaithua = 1;
        for ( i = 1 ; i <= n ; i++)
            giaithua *= i;
           
        
        System.out.println("Tong cua day so la : " +giaithua);
    }
    
}
