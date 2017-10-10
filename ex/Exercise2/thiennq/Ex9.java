/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_git;

import java.util.Scanner;

/**
 *
 * @author thiennq
 */
public class Ex9 {

    public static void GetFibonaci() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n>=2");
        int n = input.nextInt();
        if (n >= 2) {
            int F0 = 1;
            int F1 = 1;
            int sothuN = 0;
            for (int i = 2; i <= n; i++) {
                sothuN = F0 + F1;
                F0 = F1;
                F1 = sothuN;
            }
            System.out.println("Số Fibonacci thứ " + String.valueOf(n) + " là: " + String.valueOf(sothuN));
        } else {
            GetFibonaci();
        }
    }
}
