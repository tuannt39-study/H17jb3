/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author LENOVO
 */
public class Ex1 {

    Scanner sc = new Scanner(System.in);

    public static void checkString(String a, char c) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char s = a.charAt(i);
            if (c == s) {
                count += 1;
            } else {
                continue;
            }
        }
        System.out.println("The number apperances of your character is: " + count);
    }

    public static void main(String[] args) {
        System.out.println("Enter your String: ");
        Ex1 a = new Ex1();
        String input = a.sc.nextLine();
        System.out.println("Enter your character to check : ");
        char d = a.sc.next().charAt(0);
        checkString(input, d);
    }
}
