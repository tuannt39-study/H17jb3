/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author ThaoJ
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Giai Phuong trinh bac 1: ax2 + bx + c = 0");
        Scanner n = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = n.nextInt();
        System.out.println("Nhap b: ");
        int b = n.nextInt();
        System.out.println("Nhap c: ");
        int c = n.nextInt();
        int deta; 
        deta = b*b - 4*a*c ;
        if (deta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        }
        else if (deta == 0) {
            System.out.println("Phuong trinh co nghiem la: x =" + (-b)/c);
        }
        else{
            System.out.println("Phuong trinh co hai nhiem phan biet: x1 =" + ((-b)- Math.sqrt(deta))/2*a + "\n x2 =" + ((-b)+ Math.sqrt(deta))/2*a );
    }
    }
    
}
