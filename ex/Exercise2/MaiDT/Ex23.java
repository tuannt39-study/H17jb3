/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.pkg3;

import java.util.Scanner;

/**
 *
 * @author Win 8.1 VS8 X64
 */
public class Ex23 {

    /**
     * @param args the command line arguments
     */
    static int n, m, matran[][];

    public static void nhapmatran() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số hàng:");
        n = input.nextInt();
        System.out.println("Nhập số cột:");
        m = input.nextInt();
        matran = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("a[" + i + "," + j + " ] = ");
                matran[i][j] = input.nextInt();
            }
            System.out.println();
        }
    }

    public static void xuatmatran() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matran[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int minmatran() {
        int min = matran[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matran[i][j] < min) {
                    min = matran[i][j];
                }
            }
        }
        return min;
    }

    public static int maxle() {
        int maxle = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maxle < matran[i][j] && matran[i][j] % 2 == 1) {
                    maxle = matran[i][j];
                }
            }
        }
        return maxle;
    }

    public static int tongdong(int row) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += matran[row][i];
        }
        return tong;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int max = tongdong(0), index = 0;
        nhapmatran();
        xuatmatran();
        System.out.println("Phần tử nhỏ nhất là: " + minmatran());
        System.out.println("Phần tử lẻ lớn nhất là:" + maxle());
        for (int i = 0; i < n; i++) {
            if (max < tongdong(i)) {
                max = tongdong(i);
            }
            index = i;
        }
        System.out.println("Dòng có tổng lớn nhất là " + index + " và có giá trị là " + max);
    }

}
