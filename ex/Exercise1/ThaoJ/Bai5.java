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
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("------------------------");
        Scanner n = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = n.nextInt();
        int tong = 0;
        for(int i = 0; i <= a ; i ++){
            tong = tong + i;
        }
        System.out.println("Tong cac so la: " + tong);        
    }
    
}
