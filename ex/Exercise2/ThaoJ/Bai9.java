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
public class Bai9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,soThuN=1;
        int f0=1;
        int f1=1;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số bất kỳ: ");
        n = input.nextInt();
        if (n>1) {
        for (int i = 2; i <=n; i++) {
            soThuN=f0+f1;
            f0=f1;
            f1=soThuN;
            }
        }
        System.out.println("So thu "+n +" la " + soThuN);
    }  
}
