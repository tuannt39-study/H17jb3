/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win7
 */
// Tinh tong n so nguyen duong nhap tu ban phim
import java.util.Scanner;
public class TongN {
    public static void main(String[] args){
        // Nhap n
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban muon tinh tong bao nhieu so? =>");
        int n = sc.nextInt();sc.nextLine();
        
        // Tinh tong
        int Sum = 0;
        for(int i=1;i<=n;i++){
            Sum += i;
        }
        System.out.println("Tong "+n+" so = "+Sum);
    }
}
