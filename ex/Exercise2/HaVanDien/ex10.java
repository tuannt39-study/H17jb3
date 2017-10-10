/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ex10 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n,j,i,sum=0,du,kt=0;
        System.out.println("Nhap vao 1 so: ");
        n= sc.nextInt();
//        for(i=2;i*i<=n;i++)
//            if(n%i==0)
//            {
//                System.out.println("Khong phai so nguyen to!");
//                kt=1;
//                break;
//            }
//        if(kt==0)
            {
             j=n;
             while(j>0)
             {
                 du=j%10;
                 sum+=du;
                 j=j/10;
             }
             System.out.println("Tong cac chu so la: "+sum);
            }
    }
    
}
