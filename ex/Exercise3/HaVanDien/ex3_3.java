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
public class ex3_3 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str;
        System.out.println("Nhap vao ho va ten");
        str= sc.nextLine();
        String[] array;
        array = str.split(" ");
        System.out.println("Ky tu dau cua tung tu trong ho ten: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(" "+array[i].charAt(0));
        
    }
    
}
