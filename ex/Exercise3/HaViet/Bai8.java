/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuoi;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author viet
 */
public class Bai8 {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        String chuoi = "";
        // Input
        try {
            System.out.print("Nhap chuoi : ");
            chuoi = in.nextLine();
        } catch (Exception e){
            System.out.println("Error !");
        }
        
        char c = ' ';
        try {
            System.out.print("Nhap ky tu muon xoa: ");
            c = (char) System.in.read();
        } catch (IOException e) {
            System.out.println("Error !");
        }
        // Xu ly
            chuoi = chuoi.replaceAll(String.valueOf(c) , "");
            System.out.println("Chuoi sau khi xu ly : "+chuoi);
        }
            
    
}
