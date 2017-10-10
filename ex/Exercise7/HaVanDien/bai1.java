/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex7;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;


/**
 *
 * @author Admin
 */
public class bai1 {
    public static void main(String[] args) throws MyException {
        float a,b,c;

        Scanner sc=new Scanner(System.in);

//     try{
//            System.out.println("Nhap vao so a");
//            a= sc.nextFloat();
//            System.out.println("Nhap vao so b");
//            b= sc.nextFloat(); 
//            c=a/b;
//            System.out.println("ket qua a/b: "+c);
//        }
//        catch(ArithmeticException e){
//            System.out.println("Loi chia cho khong"); 
//        }
//        catch(InputMismatchException e1){
//            System.out.println("Loi nhap vao ky tu");
//        }
//        Random  rd= new Random();
//        int[] arr= new int[100];
//        for(int i=0;i<100;i++)
//        {
//            arr[i]=rd.nextInt();
//        }
//        try{
//        System.out.println("Nhap vao vi tri:");
//        int k=sc.nextInt();
//        System.out.println("Gia tri cua phan tu:"+arr[k]);
//        }
//        catch(ArrayIndexOutOfBoundsException e2){
//            System.out.println("Ban nhap qua so phan tu cua mang");
//        }
//    }
        int[][] arr2= new int[10][10];
        int m = 0,n = 0;
        try{
            System.out.println("Nhap vao canh m:");
             m= sc.nextInt();
            System.out.println("Nhap vao canh n:");
             n= sc.nextInt();
             if(m<0||n<0)
             {
                 throw new MyException(m);
             }
        }
        catch(NumberFormatException e3){
            System.out.println("Kieu du lieu khong phu hop");
        }
        catch(InputMismatchException e4){
            System.out.println("Nhap sai kieu du lieu");
        }
        try{
            for(int i=0;i<m;i++)
            for(int j=0;j<n;i++)
            {   
                System.out.println("Nhap vao gia tri");
                arr2[i][j]=sc.nextInt();
            }
        }
        catch(NumberFormatException e3){
            System.out.println("Kieu du lieu khong phu hop");
        }
        catch(InputMismatchException e4){
            System.out.println("Loi nhap ky tu");
        }
    
    }
    

}

class MyException extends Exception {
    
    private int ex;

     MyException(int num) {
       if(num<0);
        System.out.println("Loi nhap nho hon khong");
    } 
}