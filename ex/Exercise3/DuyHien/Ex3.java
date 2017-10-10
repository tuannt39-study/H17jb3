
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Ex3 {

    public static void firstLetter(String[] a) {
        char c;
        System.out.println("Your first characters are: ");
        for (int i = 0; i < a.length; i++) {
            c = a[i].charAt(0);
            System.out.print(c + " ");
            System.out.print("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner v = new Scanner(System.in);
        System.out.println("How many names you want to input: ");
        int num;
        num = sc.nextInt();
        String[] name = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the " + i + " name !");
            name[i] = v.nextLine();
        }
        firstLetter(name);
    }
}
