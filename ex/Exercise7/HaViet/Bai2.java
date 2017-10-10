/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author VIET - HP8570W
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        try {
            System.out.print("Nhap a : ");
            a = in.nextInt();
            System.out.print("Nhap b : ");
            b = in.nextInt();
            float c = a/b;
        } catch (InputMismatchException e1) {
            System.out.println("Nhap sai kieu");
        } catch (ArithmeticException e2){
            System.out.println("Loi chia cho 0");
        }
        
        
    }
}
