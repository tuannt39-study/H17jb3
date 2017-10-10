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
public class Ex6 {

    public static void main(String[] args) {
        Integer m = null, n = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Chương trình cho phép tạo một mảng 2 chiều cỡ mxn");
        System.out.println("Nhập m: ");
        while (null == m) {
            m = InputSize(input);
        }
        System.out.println("Nhập n: ");
        while (null == n) {
            n = InputSize(input);
        }
        System.out.println("Da tao mang 2 chieu voi kich thuoc " + m + "x" + n);
    }

    static Integer InputSize(Scanner input) {
        try {
            Integer i = Integer.parseInt(input.nextLine());
            if (i < 0) {
                throw new Exception("+");
            }
            return i;
        } catch (NumberFormatException e) {
            System.out.println("Hãy nhập số nguyên");
            return null;
        } catch (Exception ex) {
            if ("+".equals(ex.getMessage())) {
                System.out.println("Hãy nhập số nguyên >= 0");
            } else {
                System.out.println(ex.getMessage());
            }
            return null;
        }
    }
}
