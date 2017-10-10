/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuoi;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author viet
 */
public class Bai3 {
    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        String hoten = "";
        //Input
        try {
            System.out.print("Nhap ho ten : ");
            hoten = in.nextLine();
        } catch (Exception e) {
            System.out.println("Nhap sai ");
        }
        // Xu ly
        hoten = hoten.trim();
        String[] spiChuoi = hoten.split("\\s");
        for ( int i = 0 ; i < spiChuoi.length ; i++ )
            System.out.print(spiChuoi[i].charAt(0)+" ");
        
        
        
        
    }
    
}
