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
public class Ex1 {

    public static void main(String[] args) {
        try {
            float a;
            float b;
            Scanner input = new Scanner(System.in);
            System.out.println("Nhập số thứ nhất: ");
            a = input.nextFloat();
            System.out.println("Nhập số thứ hai: ");
            b = input.nextFloat();
            System.out.println("Kết quả (số thứ nhất/số thứ hai) là: " + a / b);
        } catch (ArithmeticException ex) {
            System.out.println("Phép toán không chính xác, bạn đã nhập số thứ 2 là 0");
        }
    }
}
