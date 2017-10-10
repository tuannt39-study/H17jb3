/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExException;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author thiennq
 */
public class Ex7 {

    Integer ngay = null, thang = null, nam = null;
    Date date = new Date();

    public static void main(String[] args) throws DateException {
        try {
            Scanner input = new Scanner(System.in);

            System.out.println("Nhập ngày theo định dang DD/MM/YYYY: ");
            while (!CheckDate(input)) {

            }
//if()
//            System.out.println("Nhập số thứ nhất: ");
//            a = input.nextFloat();
//            System.out.println("Nhập số thứ hai: ");
//            b = input.nextFloat();
//            System.out.println("Kết quả (số thứ nhất/số thứ hai) là: " + a / b);
        } catch (ArithmeticException ex) {
            System.out.println("Phép toán không chính xác, bạn đã nhập số thứ 2 là 0");
        }
    }

    static Boolean CheckDate(Scanner input) throws DateException {
        try {
            String[] arrS = input.nextLine().split("/");
            if (arrS.length != 3) {
                throw new DateException("Nhập ngày theo đúng định DD/MM/YYYY: ");
            }
//            else if (arrS[0]< 1 && arrS[0] > 31) {
//                throw new DateException("Nhập ngày từ 1-31");
//            }
            return true;
        } catch (DateException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}

class DateException extends Exception {

    public DateException(String msg) {
        super(msg);
    }
}
