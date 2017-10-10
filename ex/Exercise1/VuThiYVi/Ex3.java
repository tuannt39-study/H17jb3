/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E3;

import java.util.Scanner;

/**
 *
 * @author Ruki-Vi
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.println("Tinh Phuong Trinh Bac Nhat ax + b = 0");
        System.out.print("Nhap so a: ");
        int a = scn.nextInt();
        System.out.print("Nhap so b: ");
        int b = scn.nextInt();
        System.out.println("Ket qua giai phuong trinh bac nhat: ");
        System.out.println(a + "x" + " + " + b + " = 0");
        System.out.println("=> x = " + ((-b) / a));
    }

}
