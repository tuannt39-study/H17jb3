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
public class Bai4 {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        String chuoi = "";
        //
        try {
            System.out.print("Nhap duong dan tap tin : ");
            chuoi = in.nextLine();
        } catch (Exception e) {
            System.out.println("Error !");
        }
        //
        System.out.println("Ten : "+chuoi.substring(chuoi.lastIndexOf("/") +1 , chuoi.lastIndexOf(".")));
        System.out.println("Phan mo rong: "+chuoi.substring(chuoi.lastIndexOf(".") +1));
        System.out.println("Duong dan tap tin : "+chuoi.substring(0, chuoi.lastIndexOf("/")+1));
        
    }
    
}
