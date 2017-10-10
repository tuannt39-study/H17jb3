/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hack_string;

/**
 *
 * @author LilyEvans
 */
public class Ex4 {

    public static void main(String[] args) {
        processUrl("/home/user/filename.png");
    }

    public static void processUrl(String url) {
        String[] parts = url.trim().split("/");
        StringBuffer dr = new StringBuffer();
        for (int i = 0; i < parts.length - 1; i++) {
            dr.append(parts[i] + "/");
        }
        String[] part2 = parts[parts.length - 1].split("\\.");
        System.out.println("Name: " + part2[0]);
        System.out.println("Extension: " + part2[1]);
        System.out.println("Dr: " + dr.toString());
    }
}
