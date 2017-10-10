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

public class Bai12 {
    
    public static boolean checker(int x) 
    {
        for (int i = 2; i < (int)x/2 ; i++)
            if ( x % 2 == 0 )
            {
                return false;
                
            }
        return true;
    }
    //
    public static void main(String[] args) {
        int n = 0 ;
        int i;
        //      
        Scanner inp = new Scanner(System.in);
        System.out.println("Nhap kick co cua mang : ");
        n = inp.nextInt();
        int[] arr = new int[n-1];
        //        Nhap mang
        System.out.println("Nhap mang: ");
        for ( i=0 ; i < n-1 ; i++)
        {
            System.out.print("Phan tu thu "+i+" ");
            arr[i] = inp.nextInt();
         
        }
        //        In ra phan tu cua mang , min max , so nguyen to 
        System.out.println("In ra phan tu cua mang");
        for ( i = 0 ; i < n-1 ; i++)
        {
            System.out.print("arr["+i+"] = "+arr[i]+" ");
            
        }
        //      Min Max , so chan , so nguyen to    
        int min = arr[0];
        int max = arr[0];
        int dem = 0;
        for ( i = 0 ; i < n-1 ; i++)
        {
            if ( arr[i] % 2 == 0 )
                dem += 1;
            if ( min > arr[i] )
                min = arr[i];
            if ( max < arr[i] )
                max = arr[i];
            if ( checker(arr[i]) == true )
                System.out.println("So "+arr[i]+" la so nguyen to");
        }
        System.out.println("Trong mang co "+dem+" so chan");
        System.out.println("Phan tu nho nhat trong mang la :"+min);
        System.out.println("Phan tu lon nhat trong mang la: "+max);
        // Sap xep mang tang dan
        int temp = arr[0];
        for ( i = 0 ; i < n-2 ; i++)
            for (int j = i+1 ; j < n-1 ; j++)
                if ( arr[i] > arr[j] )
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        System.out.println("Mang sap xep theo thu tu tang dan");
        for ( i = 0 ; i < n-1 ; i++)
            System.out.println(""+arr[i]);
        // Tim nhan to x
        int x = 0;
        System.out.println("Nhap phan tu can tim : ");
        x = inp.nextInt();
        boolean kt = false;
        for ( i = 0 ; i < n-1 ; i++)
            if ( arr[i] == x )
            {
                System.out.println("Phan tu thu "+i);
                kt = true;
            }
        if ( kt )
            System.out.println("Trong mang khong co phan tu can tim");
        
    }
    
}
