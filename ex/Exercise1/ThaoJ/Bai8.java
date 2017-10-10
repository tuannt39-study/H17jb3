/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

import java.util.Scanner;

/**
 *
 * @author ThaoJ
 */
public class Bai8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Chuong tinh tinh tong 1 + ... + 1/a");
        Scanner n = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = n.nextInt();
        double tong1 = 1;       
        double tong2 = 0;
            for(int i = 1; i <= a; i ++){

                tong1 = tong1 * i;  
                tong2 = tong2 + i / tong1;
            }
        System.out.println("Tong la: " + tong2 );
    }
}
