/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ex316 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập xâu x: ");
        String str = input.nextLine();
        int maxcount = 0, currcount=0;
        char maxChar=' ';
        char currChar=' ';
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++){
            if (i==0){
                currChar = arr[i];
                currcount = 1;
            }
            else {
                if (currChar == arr[i]){
                    currcount ++;
                }else{
                    currChar = arr[i];
                    currcount = 1;
                }
            }
            if (maxcount < currcount){
                maxcount = currcount;
                maxChar = currChar;
            }
        }
        System.out.println("Ky tu "+maxChar);
        System.out.println("So luong:"+maxcount);
        
    }
}
