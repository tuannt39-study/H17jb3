/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author Win 8.1 VS8 X64
 */
public class EX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Tìm số Fibonaci thứ n//
        int n;
        int f0 = 1;
        int f1 = 1;
        int fn = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào n:");
        n = input.nextInt();
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
            }
        }
        System.out.println("Số thứ " + n + " là: " + fn);
    }

}
