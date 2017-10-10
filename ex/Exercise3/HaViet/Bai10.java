/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuoi;

import java.util.Scanner;

/**
 *
 * @author viet
 */
public class Bai10 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        // Input
         String chuoi = "";
        try {
            System.out.print("Nhap chuoi : ");
            chuoi = in.nextLine();
        } catch (Exception e) {
            System.out.println("Error !");
        }
        // Split 
        String[] spiChuoi = chuoi.split("\\s");
        // 
        for ( int i = spiChuoi.length -1 ; i >=0  ; i-- )
            System.out.print(spiChuoi[i]+" ");
            
        
    }
    
    
}
