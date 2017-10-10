/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win7
 */
// Tinh n!
import java.util.Scanner;
public class GiaiThua {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban muon tinh giai thua nao? => n = ");
        int n = sc.nextInt(); sc.nextLine();
        
        long gt = 1;
        for(int i=1;i<=n;i++){
            gt *= i; 
        }
        System.out.println(n+"! = "+gt);
    }
}
