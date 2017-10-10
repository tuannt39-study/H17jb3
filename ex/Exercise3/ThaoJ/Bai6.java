/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ThaoJ
 */
public class Bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chuoi:  ");
        String str = input.nextLine();
        int mDen = 0, a = 0;
        char mChu=' ';
        char b=' ';
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++){
            if (i==0){
                b = arr[i];
                a = 1;
            }
            else {
                if (b == arr[i]){
                    a ++;
                }else{
                    b = arr[i];
                    a = 1;
                }
            }
            if (mDen < a){
                mDen = a;
                mChu = b;
            }
        }
        System.out.println("Ky tu " + mChu);
        System.out.println("So luong:" + mDen);
    }
    
}
