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
public class Bai13 {
    public static void main(String[] args) {
        // Nhap ma tran
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
        // Xuat ma tran , tim min max , dong co tong lon nhat
        int min = arr[0][0];
        int slmax = 0;
        int tong = 0 , dmax = 0, mark = 0;
        
        for ( i = 0 ; i < n ; i++)
        {
            for ( j = 0 ; j < m ; j++)
            {
                System.out.print(+arr[i][j]+" ");
                if ( min > arr[i][j] )
                    min = arr[i][j] ;
                if ( arr[i][j] % 2 == 1 && arr[i][j] > slmax )
                    slmax = arr[i][j] ;  
                    tong += arr[i][j];
            }            
            if ( dmax < tong )
            {
                dmax = tong;
                mark = i;
            }
        }
            if ( dmax != 0 )
                System.out.println("\n Phan tu le lon nhat : "+slmax);
            else
                System.out.println("Trong mang khong co so le nao");
            
        //Dong co tong lon nhat 
        
        System.out.println("Dong "+mark+" co tong lon nhat");
        }
    }

