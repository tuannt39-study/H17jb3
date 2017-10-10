/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hack_string;

import static hack_string.Ex1_2_3.inputString;

/**
 *
 * @author LilyEvans
 */
public class Ex9_10 {

    public static void main(String[] args) {
        String inp = inputString();
        System.out.println(reverseString(inp));
        System.out.println(reverseWords(inp));
    }

    public static String reverseString(String inp) {
        String result = "";
        for (int i = inp.length() - 1; i >= 0; i--) {
            result += inp.charAt(i);
        }
        return result;
    }

    public static String reverseWords(String inp) {
        String[] splitString = inp.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = splitString.length - 1; i >= 0; i--) {
            result.append(splitString[i]);
            result.append(" ");
        }
        return result.toString().trim();
    }
}
