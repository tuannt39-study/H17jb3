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
public class Bai13 {
    public static void main(String[] args) {
        int max = tongdong(0),chiso=0;
        nhapMaTran();
        hienThiMaTran();
        System.out.println("----------------------------------------------------");
        System.out.println("Phần tử nhỏ nhất của Ma Trận là:  "+minMaTran());
        System.out.println("----------------------------------------------------");
        System.out.println("Phần tử lẻ nhỏ nhất của Ma Trận là: " + minleMaTran());
        
        for (int i = 0; i < n; i++) {
            if (max<tongdong(i)) {
            max=tongdong(i);
            chiso=i;
            }
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Dòng có tổng lớn nhất là:  "+ chiso +"\n \t \t  Có tổng = "+max);
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
    public static int minMaTran(){
        int min=MT[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (MT[i][j]<min) {
                    min=MT[i][j];
                }
            }
        }
        return min;
    }
    public static int minleMaTran(){
        int minle = 2106;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((MT[i][j]<minle)&&(MT[i][j]%2==1)) {
                minle=MT[i][j];
                }
            }
        }
        return minle;
    }
    public static int tongdong(int row){
        int tong=0;
        for (int i = 0; i < m; i++) {
            tong =tong + MT[row][i];
        }
        return tong;
    }
}
