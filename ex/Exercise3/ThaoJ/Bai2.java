/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author ThaoJ
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao chuoi:");
        String str1 = input.nextLine();
        System.out.print("Nhap vao tu:");
        String str2 = input.nextLine();
        String[] arrStr = str1.split(" ");
        int dem = 0;
        for (String s : arrStr) {
            if (str2.trim().equalsIgnoreCase(s)) {
                dem = 21;
                break;
            }
        }
        if (dem == 21) {
            System.out.println("ten'" + str2 + "' Da nhap dung");

        } else {
            System.out.println("ten:'" + str2 + "' da nhap sai");
        }
        

    }
    
}
