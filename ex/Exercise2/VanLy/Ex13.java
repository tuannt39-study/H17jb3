/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hack_week1;

import java.util.Scanner;

/**
 *
 * @author LilyEvans
 */
public class Ex13 {

    private int[][] arr;

    /**
     * constructor
     */
    public Ex13(int[][] arr) {
        this.arr = arr;
    }

    /**
     * get array from keyboard returns arr[][] if all validate
     */
    public static int[][] getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập m: ");
        int m = sc.nextInt();
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Nhập mảng có " + m + " dòng " + n + " cột: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        return arr;
    }

    /**
     * print array
     */
    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * find min and max returns a[0]= min, a[1] = max;
     */
    public int[] minMax() {
        int min = arr[0][0];
        int max = min;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        int[] a = {min, max};
        return a;
    }

    /**
     * count sum of each row returns the row has max Sum
     */
    public int sumRow() {
        int a = 0, b = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                a += arr[i][j];
            }
            if (a > b) {
                b = i + 1;
            }
        }
        System.out.println("Dòng có tổng lớn nhất là dòng thứ " + b);
        //Dòng có tổng lớn nhất là: b
        return b;
    }

    public static void main(String[] args) {
        Ex13 sample = new Ex13(getArray());
        System.out.println("Mảng vừa nhập: ");
        sample.printArray();
        sample.minMax();
        sample.sumRow();
    }
}
