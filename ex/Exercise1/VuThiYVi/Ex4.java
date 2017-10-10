/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E4;

import java.util.Scanner;

/**
 *
 * @author Ruki-Vi
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.println("Tinh Phuong Trinh Bac Hai ax^2 + bx + c = 0");
        System.out.print("Nhap so a: ");
        double a = scn.nextFloat();
        System.out.print("Nhap so b: ");
        double b = scn.nextFloat();
        System.out.print("Nhap so c: ");
        double c = scn.nextFloat();
        System.out.println("Ket qua giai phuong trinh bac hai: ");
        double delta = Math.sqrt(b * b - 4 * a * c);
        if (delta > 0) {
            System.out.println("Phuogn trinh co hai nhiem: ");
            System.out.println("=> x1 = " + (((-b) + delta) / 2 * a));
            System.out.println("=> x2 = " + (((-b) - delta) / 2 * a));
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep: ");
            System.out.println("= > x = " + ((-b) / 2 * a));
        } else {
            System.out.println("Phuong trinh vo nghiem!!!");
        }
    }

}
