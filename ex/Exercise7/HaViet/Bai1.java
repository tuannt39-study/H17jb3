/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.util.Scanner;

/**
 *
 * @author VIET - HP8570W
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 5;
        int b = 0;
        try {
            int c = a/b;
        } catch (ArithmeticException e) {
            System.out.println("Loi chia cho 0");
        }
        
    }
}
