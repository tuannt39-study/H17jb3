/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author viet
 */
public class Bai14 {
    public static void main(String[] args) {        
        int n = 0;
        int m = 0;
        int i,j;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = nhap.nextInt();
        System.out.print("Nhap m: ");
        m = nhap.nextInt();
        int[][] arr = new int[m][n];
        for ( i = 0 ; i < n ; i++)
        {
            for ( j = 0 ; j < m ; j++)
            {
                System.out.print("Nhap arr["+i+"]["+j+"] = ");
                arr[i][j] = nhap.nextInt();
            }
        }
    }
}
