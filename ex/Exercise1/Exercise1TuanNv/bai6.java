/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg1.pkg1;

/**
 *
 * @author TUAN
 */
import java.util.Scanner;
public class bai6 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int n=0, i=1;
        float tong=0;
        System.out.println("nhap n= ");
        n=scanner.nextInt();
        while(i<=n){
            tong+=(float)1/i;
            i++;
        }
        System.out.println("tong la:  " +tong);
    }
}