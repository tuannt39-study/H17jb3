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
public class Bai7 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String chuoi = "";
        // Input
        try {
            System.out.print("Nhap chuoi : ");
            chuoi = in.nextLine();
        } catch (Exception e) {
            System.out.println("Error !");
        }
        // Process
        chuoi = chuoi.replaceAll(" ", "");
        System.out.println("Chuoi sau khi xoa khoang trang la : "+chuoi);
    }
    
}
