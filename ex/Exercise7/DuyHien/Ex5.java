/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ex5 {

    public static void main(String[] args) {
        int[] a = new int[100];
        int b;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ban muon nhap vao mang bao nhieu? ");
            b = sc.nextInt();
            System.out.println("Ok nhap so ban muon nhap vao mang: ");
            a[b] = sc.nextInt();
            System.out.println("Your number : " + a[b]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + "OutOfBound");

        }

    }
}
