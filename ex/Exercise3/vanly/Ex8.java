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
public class Ex8 {

    public static void main(String[] args) {
        String chars = "";
        System.out.println("Enter your string: ");
        String inp = inputString();
        String element;
        do {
            System.out.println("Enter a Character: ");
            element = inputString();
        } while (element.length() != 1);
       String result =  inp.replaceAll(element, "");
        System.out.println("Result: " + result);
                
    }
}
