/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class bai6 {
    public static void main(String[] args)
    {
        System.out.println("Nhap xau: ");
        String str;
        Scanner sc=new Scanner(System.in);
        int max;        
        str = sc.nextLine();
        int[] st = new int[256];        
        max=st[0];
        int k = 0;
        for(int i=0;i<st.length;i++)
        {
          if(i!=32)
          {
          if(max<st[i])
          { 
              k=i;
              max=st[i];
          }
        }
        }           
            System.out.println("Ky tu xuat hien nhieu nhat la: "+((char)k)+" "+max+" lan");
    }
   
}
