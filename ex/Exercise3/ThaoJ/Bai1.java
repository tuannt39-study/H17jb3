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
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi ky tu");
        String str1 = n.nextLine();
        System.out.println("Nhap vao 1 ky tu");
        char str2 = n.next().charAt(0);
        int dem=0;
        for(int i=0;i<str1.length();i++){
            if(str2 == str1.charAt(i)) dem++;
        }
        System.out.println("So lan xuat hien "+str2+": "+dem);
    }
}
