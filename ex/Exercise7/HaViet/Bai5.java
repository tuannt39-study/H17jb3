/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.util.Scanner;

/**
 *
 * @author VIET - HP8570W
 */
public class Bai5 {

    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = (int) Math.round(Math.random() * 100);
        }
        int n;
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Nhap chi so can tim : ");
            n = in.nextInt();
            System.out.println(arr[n]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ngoai phan tu cua mang , chuong trinh ket thuc !");
        }
        
    }
}
