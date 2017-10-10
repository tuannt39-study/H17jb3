/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ex12 {
    public static void main(String[] args)
    {
        int arr[]=new int[100];
        int n,i,j,max,min,x,dem=0,kt=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so phan tu: ");
        n= sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.print("Phan tu thu "+(i+1)+"= " );
            arr[i]=sc.nextInt();
        }
        // in mang
        for(i=0;i<n;i++)
            System.out.print(+arr[i]+" ");
        //max,min
        max=min=arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i]>max)
                max=arr[i];
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println("\r\nMax= "+max);
        System.out.println("Min= "+min);
        // dem pt chan
        for(i=0;i<n;i++)
            if(arr[i]%2==0)
            {
                dem++;
            }
        System.out.println("So phan tu chan la: "+dem);
        
        //tim phan tu la so nguyen to
        System.out.print("So nguyen to la: ");
        for(i=0;i<n;i++)
        {
            for(j=2;j*j<=arr[i];j++)
                if(arr[i]%j==0)
                    break;
                else if(j+1>sqrt(arr[i]))
                    System.out.print(" "+arr[i]);
            
        }
        // Sap xep mang tang dan
        for(i=0;i<n;i++)
            for(j=n-1;j>i;j--)
                if(arr[j]<arr[j-1])
                {
                    int tg=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tg;                    
                }
        System.out.println(" ");
        for(i=0;i<n;i++)
        { 
            System.out.print("  "+arr[i]);
    }
        //tim phan tu x
        System.out.print("\r\nNhap vao phan tu x ");
        x=sc.nextInt();
        for(i=0;i<n;i++)
            if(arr[i]==x)
            {
                kt=1;
                System.out.println("Tim thay phan tu "+ x +" o vi tri "+i);
            }
        if(kt ==0)
              System.out.println("Khong co phan tu!");
    }
}
