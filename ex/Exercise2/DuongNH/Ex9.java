/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B2;

/**
 *
 * @author Win7
 */
import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so Fibonacci can tinh(n>=2): ");
        int n = sc.nextInt();sc.nextLine();
        
        int Fn = 1;
        int Ft = 1;
        int tg;
        for(int i=2;i<=n;i++){
            tg = Fn;
            Fn += Ft;
            Ft = tg;
        }
        System.out.println("So Fibonacci thu "+n+" = "+Fn);
    }
}
