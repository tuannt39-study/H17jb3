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
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao chuoi:");
        String str1 = input.nextLine();
        String[] str2 = str1.split(" ");
        System.out.print("Chu cai dau tien la :");
        for (String s : str2) {
            if (!s.isEmpty()) {
                System.out.print(s.charAt(0) + " ");
            }
        }
        System.out.println();
    }
    
}
