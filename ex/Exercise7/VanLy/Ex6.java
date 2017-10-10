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
public class Ex6 {

    public static void main(String[] args) {

        int[][] arr = new int[input()][input()];
        genArr(arr);
        System.err.println("Array was generated!");
        System.out.println("Chose position you want to see");
        search(arr);

    }

    public static int input() {
        int a = 0;
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        while (a == 0) {
            try {
                String inp = sc.next();
                a = Integer.parseInt(inp);

            } catch (NumberFormatException e) {
                System.err.println("Input error. Re-enter your number");
            }
        }
        return a;
    }

    public static void genArr(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int) (Math.round(Math.random() * 100));
            }
        }
    }

    public static void search(int[][] a) {
        Scanner sc = new Scanner(System.in);
        int x = -1;
        int y = -1;
        try {
            x = input();
            y = input();
            System.out.println(a[x][y]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bounds");
        }
    }
}
