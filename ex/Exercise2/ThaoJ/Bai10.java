/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author ThaoJ
 */
public class Bai10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,tong=0;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao so nguyen n");
        n=input.nextInt();
        while (n>0) {
            tong=tong + n%10;
            n= n/10;
        }
        System.out.println("tong cac chu so cua n la: "+tong);
    }
    
}
