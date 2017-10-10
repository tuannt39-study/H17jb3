/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExException;

import java.util.Scanner;

/**
 *
 * @author thiennq
 */
public class Calculator {

    public static void main(String[] args) {
        String err = "";
        try {

            System.out.println("Hay nhap phep toan: ");
            Scanner input = new Scanner(System.in);
            String s = input.nextLine();
            String[] arrS = s.split(" ");
            err = arrS[0];
            int a = Integer.parseInt(arrS[0]);
            err = arrS[2];
            int b = Integer.parseInt(arrS[2]);
            int result = 0;
            switch (arrS[1]) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
                default:
                    break;
            }
            System.out.println(arrS + " = " + result);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong input: " + err);
        } catch (Exception e) {
            System.out.println("Nhap phep toan dang a + b");
        }
    }
}
