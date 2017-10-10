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
public class Bai3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[1]);
            System.out.println(a+" + "+b+" = "+(a+b));
            System.out.println(a+" - "+b+" = "+(a-b));
            System.out.println(a+" * "+b+" = "+(a*b));
            System.out.println(a+" / "+b+" = "+(a/b));            
        } catch (NumberFormatException e1) {
            System.out.println("Nhap sai kieu du lieu");
        } catch (ArithmeticException e2){
            System.out.println("Loi chia cho 0");
        } 
        }
    }
