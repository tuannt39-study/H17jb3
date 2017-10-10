/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hack_string;

import static hack_string.Ex1_2_3.*;

/**
 *
 * @author LilyEvans
 */
public class Ex6 {

    public static void main(String[] args) {
        System.out.println("Enter your String");
        String inp = inputString();
        String src = "";
        int[] fre = new int[256];
        for (int i = 0; i <= 255; i++) {
            src += (char) i;
            fre[i] = 0;
        }
        int maxFre = 0;
        for (int i = 0; i < inp.length(); i++) {
            fre[src.indexOf(inp.charAt(i))]++;
            if (fre[src.indexOf(inp.charAt(i))] > maxFre) {
                maxFre = fre[src.indexOf(inp.charAt(i))];
            }
        }
        System.out.println("Max freq: " + maxFre);
        for (int i = 0; i < 256; i++) {
            if (fre[i] == maxFre) System.out.println(src.charAt(i));
        }
    }
}
