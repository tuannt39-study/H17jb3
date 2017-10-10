/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author ThaoJ
 */
public class Bai11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập số nguyên n lớn hơn hoặc bằng 1: ");
        n = nhap.nextInt();
        while (n<1){
            System.out.println("n phải lớn hơn hoặc bằng 1. \n Xin hãy nhập lại: ");
            n = nhap.nextInt();
        }
        if (n==1){ 
            System.out.println(n + " Không phải số nguyên tố");
        }
        else if (n==2){
            System.out.println(n + " Là số nguyên tố");
        }
        else{
            int dem = 0;
            for (int i = 2; i<=n/2; i++){
                if (n%i == 0)
                dem++;
            }
            if (dem == 0)
                System.out.println(n + " Là số nguyên tố");
            else
                System.out.println(n + " Không phải số nguyên tố"); 
        }
    }
        
}
    
    

