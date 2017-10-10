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
public class Bai2 {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        String hoten = "";
        // Nhap ho ten
        try {
            System.out.print("Nhap ho ten : ");
            hoten = in.nextLine();
        } catch (Exception e) {
            System.out.println("Nhap sai ");
        }
        //
        String ten = hoten.substring(hoten.lastIndexOf(" ") + 1);
        System.out.println("Ban ten la : "+ten);
        
    }
}
