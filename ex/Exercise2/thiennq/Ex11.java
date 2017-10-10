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
public class Ex11 {

    public static void CheckSoNguyenTo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy nhập vào số nguyên n bất ký: ");
        int n = input.nextInt();
        boolean isSNT = n > 1;
        for (int i = 2; i < n; i++) {
            if (0 == n % i) {
                isSNT = false;
                break;
            }
        }
        if (isSNT) {
            System.out.println(n + " là số nguyên tố");
        } else {
            System.out.println(n + " không phải là số nguyên tố");
        }
    }
}
