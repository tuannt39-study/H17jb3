/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExException;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author thiennq
 */
public class Ex4 {

    public static void main(String[] args) {
        Integer a = null, b = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        while (null == a) {
            a = InputInterger(input);
        }
        System.out.println("Nhập số thứ hai: ");
        while (null == b) {
            b = InputInterger(input);
        }
        System.out.println("Kết quả (số thứ nhất/số thứ hai) là: " + (a + b));
    }

    static Integer InputInterger(Scanner input) {
        try {
            return Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Hãy nhập lại số nguyên");
            return null;
        }
    }
}
