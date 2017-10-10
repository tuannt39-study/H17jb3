/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.pkg2;

import java.util.Arrays;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Win 8.1 VS8 X64
 */
public class Ex22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[];
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào n:");
        n = input.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Hãy nhập vào a[" + i + "] = ");
            arr[i] = input.nextInt();
        }
        // In ra các phần tử của mảng//
        System.out.println("1.Giá trị các phần tử của mảng lần lượt là:");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]= " + arr[i] + ";");
        }
        // TÌm phần tử có giá trị lớn nhất, nhỏ nhất//
        int min = arr[0];
        int max = arr[0];
        System.out.println("2.Tìm phần tử có giá trị lớn nhất/ nhỏ nhất:");
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("2.1.Phần tử có giá trị nhỏ nhất trong mảng là:" + min);
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("2.2.Phần tử có giá trị lớn nhất trong mảng là:" + max);

        // Đếm số phần tử là số chẵn//
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                dem++;
            }
        }
        System.out.println("3.Số phần tử là số chẵn = " + dem);

        // TÌm các phần tử là số nguyên//
        for (int i = 0; i < n; i++) {
            if (nguyento(arr[i])) {
                System.out.println("4.Phần tử a[" + i + "] = " + arr[i] + " là số nguyên tố.");
            }

        }

        //Sắp xếp mảng tăng dần//
        Arrays.sort(arr);
        System.out.println("Mảng được sắp xếp theo thứ tự tăng dần:");
        for (int i = 0; i < n; i++) {

            System.out.println("a[" + i + "] = " + arr[i] + ";");
        }
        // tìm vị trí phần tử x;

        int x;
        System.out.println("Nhập x = ");
        x = input.nextInt();
        int vt = Arrays.binarySearch(arr, x);
        System.out.println("Vị trí của " + x + " trong mảng là " + vt);
    }

    static boolean nguyento(int v) {
        if (v < 3) {
            return true;
        }
        for (int i = 3; i <= sqrt(v); i++) {
            if (v % i == 0);
            return false;
        }
        return true;
    }
}
