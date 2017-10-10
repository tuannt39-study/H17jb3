/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex9 {

 
    public static void main(String[] args) {
        System.out.println("Enter sring: ");
        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        char[] rev = a.toCharArray();
        for (int i = 0; i < a.length() / 2; i++) {
            char temp = rev[i];
            rev[i] = rev[rev.length - i - 1];
            rev[rev.length - i - 1] = temp;
        }
        String result = String.valueOf(rev);
        System.out.println("reveser string: " + result);

    }

}
