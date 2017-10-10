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
public class Ex10 {

    public static void TongChuSo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy nhập số nguyên n bất kỳ: ");
        int n = input.nextInt();
        int tong = 0;
        while (n != 0) {
            tong += n % 10;
            n = n / 10;
        }
        System.out.println("Tổng các chữ số của số n là: " + tong);
    }
}
