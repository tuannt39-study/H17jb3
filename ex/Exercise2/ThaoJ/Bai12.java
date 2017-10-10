/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Arrays;
import java.util.Collections;
import javafx.print.Collation;

/**
 *
 * @author ThaoJ
 */
public class Bai12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] arr = {2,1,6,1,9,9,6,8,3,5};
        // gia tri trong mang
        for(int i = 0; i < arr.length; i++){
            System.out.println("Nhap tu thu " + i + "co gia tri la: " + arr[i]);
        }
        System.out.println("--------------------------------------------");
        // min max cua mang
        int min = (int) Collections.min(Arrays.asList(arr));
        int max = (int) Collections.max(Arrays.asList(arr));
        System.out.println("So be nhat cua mang la: " + min);
        System.out.println("So lon nhat cua mang la: " + max);
        System.out.println("------------------------------------------------");
        // Đếm số phần tử là số chẵn
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.println("Số chẵn của mảng là: " + arr[i]);
            }
        }
        System.out.println("-------------------------------------------------");
        
        System.out.println("---------------------========-------------");
        //Sắp xếp mảng tăng dần
        Arrays.sort(arr);
        printArray("Độ dài của mảng: " , arr);
        System.out.println("------------------------");
        // tìm kiếm phẩn tử của mảng;
        int tk = Arrays.binarySearch(arr, 1);
        System.out.println("Phần tử 1 của mảng là: " + tk);
        
        
    }

    private static void printArray(String a, Integer[] arr) {
        System.out.println(a + ": [Độ dài: " + arr.length + "]");
      for (int i = 0; i < arr.length; i++) {
         if (i != 0){
            System.out.print(", ");
         }
         System.out.print(arr[i]);         
      }
      System.out.println();
    }

}
