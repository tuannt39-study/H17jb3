/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.util.Scanner;

/**
 *
 * @author LilyEvans
 */
public class Ex7 {

    public static int convert(String inp) {
        int a = 0;
            try {
                a = Integer.parseInt(inp);
            } catch (NumberFormatException e) {
                System.err.println("Input error. Re-enter your number");
            }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Enter your day!");
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        inp = inp.trim();
        String[] day = inp.split("/");
        int[] a = new int[day.length];
        for (int i = 0; i < day.length; i++) {
            a[i] = convert(day[i]);
        }
        System.out.println(checkDay(a));
    }

    public static boolean checkDay(int[] a) {
        if (a[1] > 12 || a[0] > 31) {
            return false;
        } else if (!leapYear(a[2]) && a[1] == 2 && a[0] > 28) {
            return false;
        } else if (!thangDu(a[1]) && a[0] == 31) {
            return false;
        }
        return true;
    }

    public static boolean leapYear(int year) {
        if ((year % 100) % 4 == 0 && (year / 100) % 4 == 0) {
            return true;
        }
        return false;
    }

    public static boolean thangDu(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return true;
        }
        return false;
    }

}
