/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E5;

import java.util.Scanner;

/**
 *
 * @author Ruki-Vi
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int S = 0;
        System.out.println("S = 1 + 2 + 3 + ... + n");
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            S += i;
        }
        System.out.println("S = " + S);
    }

}
