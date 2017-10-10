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
public class test {
    public static void main(String[] args)
    {
      int n,i;
      Scanner sc=new Scanner(System.in);
      System.out.print("Nhap vao n: ");
      n=sc.nextInt();
      int dem=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            dem++;
        }
        if(dem==2)
            System.out.println("La so nguyen to!");
        else
            System.out.println("khong la so nguyen to!");
      
    }
}
