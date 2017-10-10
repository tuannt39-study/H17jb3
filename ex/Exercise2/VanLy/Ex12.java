/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hack_week1;

import static hack_week1.Ex9_10_11.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author LilyEvans
 */
public class Ex12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        //things we need
        int arr[] = new int[n];
        int[] arr2 = new int[n];
        int soChan = 0, soNguyenTo = 0;
        // get array from key board
        System.out.print("Nhập mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        arr2 = arr;
        //print
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        //sort arr and keep arr2 as a copy
        Arrays.sort(arr);
        System.out.print("Mảng đã sắp xếp: ");
        for (int j : arr) {
            System.out.print(j + " ");
        //check even elements
            if (j % 2 == 0) {
                soChan++;
            }
        //count prime elements
            if (checkPrime(j)) {
                soNguyenTo++;
            }
        }
        //print things we need
        System.out.println();
        System.out.println("Số phần tử nguyên tố: " +soNguyenTo);
        System.out.println("Số phần tử chẵn: " + soChan);
        System.out.println("Max: " + arr[n - 1]);
        System.out.println("Min: " + arr[0]);
        //find element x
        System.out.print("Chọn x: ");
        int x = sc.nextInt();
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr2[i] == x) {
                pos = i;
                System.out.println(i + " ");
            }
        }
        if (pos == -1) System.err.println("404 not found");
    }
}
