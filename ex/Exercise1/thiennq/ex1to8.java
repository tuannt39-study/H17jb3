/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.io.Console;
import java.text.MessageFormat;
import java.util.Optional;

/**
 *
 * @author thiennq
 */
public class ex1to8 {

    String strFormat = "Ex%s: %s";

    /**
     * Bài 1. Viết chương trình in ra lời chào “Hello world!”.
     *
     */
    public void Ex1() {
        System.out.println(String.format(strFormat, 1, "Hello Word"));
    }

    /**
     * Bài 2. Viết chương trình in ra tổng của 10 số chẵn đầu tiên (sử dụng vòng
     * lặp for hoặc while).
     */
    public void Ex2() {
        int sum = 0;
        int numCur = 0;

        while (numCur <= (0 + 10 * 2)) {
            sum += numCur;
            numCur += 2;
        }
        System.out.println(String.format(strFormat, 2, sum));
    }

    /**
     * Bài 3. Viết chương trình giải phương trình bậc nhất.
     *
     * @param a
     * @param b
     */
    public void Ex3(int a, int b) {
        String result;
        if (a == 0 && b == 0) {
            result = "Phương trình vô số nghiệm";
        } else if (a == 0) {
            result = "Phương trình vô nghiệm";
        } else {
            result = String.valueOf(-b / a);
        }
        System.out.println(String.format(strFormat, 3, result));
    }

    /**
     * Bài 4. Viết chương trình giải phương trình bậc hai.
     *
     * @param a
     * @param b
     * @param c
     */
    public void Ex4(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Input a khác 0");
            return;
        }

        String result;
        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            result = "Phương trình vô nghiệm";
        } else if (delta == 0) {
            result = "Phương trình có nghiệm kép x1 = x2 = ";
            result += String.valueOf((double) (-b) / (2 * a));
        } else {
            double sqrtDelta = Math.sqrt(delta);
            result = "Phương trình có 2 nghiệm phân biệt X1 = ";
            result += String.valueOf((-b + sqrtDelta) / (2 * a));
            result += " và X2 = ";
            result += String.valueOf((-b - sqrtDelta) / (2 * a));
        }

        System.out.println(String.format(strFormat, 4, result));
    }

    /**
     * Bài 5. Viết chương trình tính tổng S = 1 + 2 + 3 + … + n với n nguyên
     * dương được nhập từ bàn phím.
     *
     * @param n
     */
    public void Ex5(int n) {
        int a = 0;
        int result = 0;

        while (a < n) {
            a += 1;
            result += a;
        }

        System.out.println(String.format(strFormat, 5, "S = " + String.valueOf(result)));
    }

    public void Ex6(int n) {
        int a = 0;
        double result = 0;

        while (a < n) {
            a += 1;
            result += 1 /(double) a;
        }

        System.out.println(String.format(strFormat, 6, "S = " + String.valueOf(result)));
    }
// 
// 
// Bài 6. Viết chương trình tính tổng S = 1 + 1/2 + 1/3 + … + 1/n với n nguyên dương được nhập từ bàn phím.
// Bài 7. Viết chương trình tính n! với n là số nguyên dương được nhập từ bàn phím.
// Bài 8. Viết chương trình tính tổng S =  1 /1! +  2 /2! + ....+  n / n!
}
