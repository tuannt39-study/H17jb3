/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author ThaoJ
 */
public class Bai14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nhapMaTran();
        System.out.println("----------------------------------------------------");
        System.out.println("Phần tử lớn nhất của Ma Trận là:  " + maxMaTran());
        
    }
    
    
    static int n,m,MT[][];
    
    public static void nhapMaTran(){
        System.out.println("-----------------------MA TRẬN----------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        n=input.nextInt();
        System.out.println("Nhập số cột: ");
        m=input.nextInt();
        System.out.println("Nhập chỉ số của hàng và cột cho ma trận.");
        MT =new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("  a["+i+","+j+"]=");
                MT[i][j]=input.nextInt();
            }
            System.out.println();
        }
    }
    
    public static void hienThiMaTran(){
        System.out.println("----------------------------------------------------");
        System.out.println("Ta được Ma Trận là: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            System.out.print(MT[i][j] +"  ");
        }
        System.out.println("");
        }
    }
    
    public static int maxMaTran(){
        int max = MT[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (MT[i][j]>max) {
                    max=MT[i][j];
                }
            }
        }
        return max;
    }
}
