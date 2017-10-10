/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;
import java.util.*;
/**
 *
 * @author Admin
 */
public class ex3_6 {
    public static void main(String[] args)
    {
        String str;
        Scanner sc=new Scanner(System.in);
        int max;
        System.out.println("Nhap vao chuoi: ");
        str = sc.nextLine();
        int[] sta = new int[256];
        for(int i = 0;i < str.length(); i ++)
        {
        char c;
        c = str.charAt(i);
        sta[(int)c] ++;
        }
        max=sta[0];
        int k = 0;
        for(int i=0;i<sta.length;i++)
        {
          if(i!=32)
          {
          if(max<sta[i])
          { 
              k=i;
              max=sta[i];
          }
        }
        }           
            System.out.println("Ky tu: "+((char)k)+" Xuat hien nhieu nhat "+max+" lan");
    }
    
}
