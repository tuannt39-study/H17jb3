/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExException;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author thiennq
 */
public class Ex5 {

    public static void main(String[] args) {
        int[] arrInt = new int[100];
        Random rand = new Random();

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = rand.nextInt(Integer.MAX_VALUE);
        }
        System.out.println("Hãy nhập phần tử muốn hiển thị( 1 - 100): ");
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        try {
            System.out.println("Giá trị của phần tử thứ [" + index + "] là: " + arrInt[index - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("“Out of Bounds” ");
        }
    }
    
    public static Integer InputInterger(Scanner input) {
        try {
            return Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Hãy nhập lại số nguyên");
            return null;
        }
    }
}
