
import java.util.Scanner;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Ex2 {

    public static void checkName(Vector<String> a, String b) {
        for (int i = 0; i < a.size(); i++) {
            if (a.contains(b)) {
                System.out.println("You enter corect.");
            } else {
                System.err.println("No exist this name. ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner v = new Scanner(System.in);
        Vector<String> names = new Vector<String>();
        String input = "";
        System.out.println("How many names you want to input? ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("name number " + (i + 1) + ": ");
            input = v.nextLine();
            while (names.contains(input)) {
                System.err.println("The name " + input + " existed, please enter again !");
                input = sc.nextLine();
            }
            names.add(input);
        }
        System.out.println("OK, enter the name you want to check ? ");
        String name2;
        name2 = v.nextLine();
        checkName(names, name2);
    }
}
