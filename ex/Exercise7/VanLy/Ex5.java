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
public class Ex5 {

    public static void main(String[] args) {
        int[] arr = new int[100];
        genArr(arr);
        search(arr);

    }

    public static void genArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.round(Math.random() * 100));
        }
    }

    public static void search(int[] a) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int input = -1;
        do {
            try {
                String inp = sc.next();
                input = Integer.parseInt(inp);
                System.out.println(a[input]);
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập lại số nguyên");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out of bounds");
            }
        } while (input != -1);
    }
}
