/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class HinhTamGiacApp {

    public static void main(String[] args) {
        System.out.println("nhap ba canh hinh tam giac");
        Scanner input = new Scanner(System.in);
        int mA = input.nextInt();
        int mB = input.nextInt();
        int mC = input.nextInt();
        HinhTamGiac t = new HinhTamGiac(mA, mB, mC);

        System.out.println("Chu vi: " + t.getChuvi());
        System.out.println("Dien tich: " + t.getDienTich());
    }
}
