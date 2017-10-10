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
public class Ex5_7 {

    public static void main(String[] args) {
        System.out.println("Enter your string: ");
        String inp = inputString();
        String chars = "";
        String nums = "";
        String vows = "ueoai";
        int countNum = 0;
        int countVows= 0;
        for (int i = 65; i < 90; i++) {
            chars += (char) i;
        }
        for (int i = 0; i < 10; i++) {
            nums += String.valueOf(i);
        }
        //gen charecters and numbers as a string
        
        String[] split = inp.split(" ");
        for (int i = 0; i < inp.length(); i++) {
            if (nums.indexOf(inp.charAt(i)) != -1) {
                countNum++;
            }
             if (vows.indexOf(inp.charAt(i)) != -1) {
                countVows++;
        }
        }
        int countChars = inp.length() - countNum - split.length + 1;
        System.out.println("Number of characters: " + countChars);
        System.out.println("Number of numbers: " + countNum);
        System.out.println("Your string: " + inp.trim());
        System.out.println("Number of words: " + split.length);
    }

}
