/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E7;

import java.util.Scanner;

/**
 *
 * @author Ruki-Vi3
 */
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int gt = 1;
        System.out.print("Nhap n: ");
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        System.out.println(n + "! = " + gt);
    }

}
