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
public class Ex2 {

    public static void main(String[] args) {
        try {
            int a;
            int b;
            Scanner input = new Scanner(System.in);
            System.out.println("Nhập số thứ nhất: ");
            a = input.nextInt();
            System.out.println("Nhập số thứ hai: ");
            b = input.nextInt();
            System.out.println("Kết quả (số thứ nhất/số thứ hai) là: " + a / b);
        } catch (InputMismatchException ex) {
            System.out.println("Chỉ được nhập vào số nguyên");
        } catch (ArithmeticException ex) {
            System.out.println("Phép toán không chính xác, bạn đã nhập số thứ 2 là 0");
        }
    }
}
