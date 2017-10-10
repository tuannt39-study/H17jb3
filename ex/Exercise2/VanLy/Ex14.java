/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hack_week1;

import static hack_week1.Ex9_10_11.checkPrime;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author LilyEvans
 */
public class Ex14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng: ");
        int n = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Nhập mảng có " + n + " dòng " + m + " cột: ");
        System.out.println("Nhập " + m * n + " phần tử liên tiếp cách nhau bởi 1 space");
        int max[] = {0, 0, 0};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[j][i] = (int) Math.round(Math.random() * 100);
                //arr[j][i] = sc.nextInt();
                if (arr[j][i] > max[0]) {
                    max[0] = arr[j][i];
                    max[1] = j;
                    max[2] = i;
                }
            }
        }
        System.out.println("max = " + max[0] + " pos " + max[2] + " " + max[1]);

        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println("Check số nguyên tố: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (checkPrime(arr[j][i])) {
                    System.out.print(arr[j][i] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
