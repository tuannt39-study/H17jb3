/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hack_string;

import java.util.Scanner;

/**
 *
 * @author LilyEvans
 */
public class Ex1_2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int countFreq() {
        System.out.println("Enter your String:");
        String inp = inputString();
        String element = "";

        do {
            System.out.println("Enter a Character: ");
            element = inputString();
        } while (element.length() != 1);
        return (freq(element, inp));
    }

    public static int freq(String e, String inp) {

        int fre = -1;
        for (int i = 0; i < inp.length(); i++) {
            if (inp.substring(i, i + 1).equals(e)) {
                fre++;
            }
        }
        return fre;
    }

    public static boolean checkName() {
        String name;
        System.out.println("Enter your full name: ");
        name = inputString();
        System.out.println("Enter name you want to check: ");
        String check = inputString();
        for (int i = 0; i < name.length() - check.length(); i++) {
            if (name.substring(i, i + check.length()).equalsIgnoreCase(check)) {
                return true;
            }
        }
        return false;
    }

    public static void initialName() {
        System.out.println("Enter your full name: ");
        String name = inputString();
        name = name.trim();
        String result = "";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                result += name.charAt(i + 1);
            }
        }
        System.out.println(result);
    }
}
