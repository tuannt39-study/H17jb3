/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E8;

import java.util.Scanner;

/**
 *
 * @author Ruki-Vi
 */
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int gt = 1;
        float S = 0;
        System.out.print("Nhap n: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            gt *= i;
            S += (1.0 / gt);
        }
        System.out.println("S = " + S);
    }

}
