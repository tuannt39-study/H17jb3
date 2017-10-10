/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuoi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



/**
 *
 * @author viet
 */
public class Bai1 {
    static Scanner in = new Scanner( System.in );

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = null;
        // Nhap chuoi
        try {
            System.out.print("Nhap chuoi : ");           
            str = in.nextLine();                        
        } catch (Exception e) {
            System.out.println("Chuoi khong hop le");
        }
        // Nhap ky tu
        char c = ' ';
        try {
            System.out.print("Nhap ky tu : ");
            c = (char) System.in.read();
        } catch (IOException e) {
            System.out.println("Ky tu nhap vao bi loi !");
        }        
        // Dem so ky tu trong chuoi
        int dem = 0 ;
        for ( int i = 0 ; i < str.length() ; i++ )
            if ( c == str.charAt(i) )
                dem += 1;
        System.out.println("So lan ky tu "+c+" xuat hien la : "+dem);
                
        
            
        
    }

   
}
