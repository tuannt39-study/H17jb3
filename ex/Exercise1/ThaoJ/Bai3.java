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
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        System.out.println("Giai Phuong trinh bac 1: ax + b = 0");
        Scanner n = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = n.nextInt();
        System.out.println("Nhap b: ");
        int b = n.nextInt();
        if(a == 0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else if (b == 0) {
            System.out.println("Phuong trinh vo so nghiem");
        }
        else{
            int kq = (-b) / a;
            System.out.println("Nghiem la: x = " + kq        );
        }
        
        
        
    }
    
}
