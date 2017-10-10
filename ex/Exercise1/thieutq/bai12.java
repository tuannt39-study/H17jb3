/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
//Nhap mang
//a-xuat mang
//b-tim max,min
//c-dem so chan
//d-tim so nguyen to  
//e-sap xep mang tang dan
//f-tim phan tu co gia tri x
public class bai12 {
     public static void main(String[]args)
    {
        int n;
        int arr[];    
        n = nhapheso("nhap so phan tu mang n=");
        arr = new int[n];
        // xuat mang
        for (int i = 0; i < n; i++)
        {            
            arr[i]=nhapheso("nhap phan tu thu " +i+" =");
        }
            for (int i = 0; i < n; i++) 
            {
                System.out.print("[ "+arr[i]+" ]");
            } 
        // tim max min    
            int min=arr[0];
            int max=arr[0];
            for (int i = 0; i < n; i++)
            {
                if (arr[i]<min)
                {
                     min=arr[i];
                }
                 if (arr[i]>max)
                {
                    max=arr[i];
                }
            }
    System.out.println("gia tri nho nhat: "+min);
    System.out.println("gia tri lon nhat: "+max);
    // dem so chan   
    int dem=0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i]%2==0) 
        {
            dem++;
        }
    }
    System.out.println("So phan tu chan trong mang la: "+dem);
    }
    public static int nhapheso(String str)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print(str);
        x= sc.nextInt();
        return x;  
               
    }
   
}
