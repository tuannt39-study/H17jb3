/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win7
 */
// Tinh tong S = 1/1! + 2/2! + ... + n/n!
import java.util.Scanner;
public class TongGTPS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ban muon tinh tong bao nhieu phan so giai thua?\n=> n = ");
        long n = sc.nextLong();sc.nextLine();
        
        float Tong = 1;
        long gt = 1;
        for(int i=2;i<=n;i++){
            gt *= i;
            Tong += (float)i/gt;
        }
        System.out.println("Tong "+n+" phan so = "+Tong);
    }
}
