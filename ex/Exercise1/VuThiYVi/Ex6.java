/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E6;

import java.util.Scanner;

/**
 *
 * @author Ruki-Vi
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int n, i;
        float S = 0;
        do {
            System.out.print("Nhap n: ");
            n = scn.nextInt();
        } while (n <= 0);
        for (i = 1; i <= n; i++) {
            S += (1 / (float) i);
        }
        System.out.println("Tong S: " + S);
    }
}
