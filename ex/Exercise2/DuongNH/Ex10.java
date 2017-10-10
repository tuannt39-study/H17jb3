package B2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win7
 */
// Tong cac chu so cua mot so nguyen bat ky
import java.util.Scanner;
public class Ex10 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen bat ky: ");
        long n = sc.nextLong();sc.nextLine();
        long a = n;
        
        //Tinh tong
        long tong = 0;
        while(n!=0){
            tong += n%10;
            n = n/10;
        }
        System.out.println("Tong cac chu so cua "+ a +" la: "+ tong);
    }
}
