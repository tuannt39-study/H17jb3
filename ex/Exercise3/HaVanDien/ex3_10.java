/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ex3_10 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str;
        String[] arr;
        System.out.println("Nhap vao chuoi ky tu");
        str=sc.nextLine();
        arr= str.split("\\s",0);
        System.out.println("Xau doi xung la: ");
        for(int i=arr.length-1;i>=0;i--)
            System.out.print(" "+arr[i]);
    }
    
}
