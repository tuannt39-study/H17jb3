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
public class bai7 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int n=0, i=1;
        float gt=1;
        System.out.println("nhap n= ");
        n=scanner.nextInt();
        while(i<=n){
            gt*=i;
            i++;
        }
        System.out.println("ket qua: "+n +"!" +"=" +gt);
    }
}
