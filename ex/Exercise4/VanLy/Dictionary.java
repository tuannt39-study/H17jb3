/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author LilyEvans
 */
public class Dictionary {
    
    private static String key, value;
    private static HashMap<String, String> hashMap = new HashMap<>();
    private static Dictionary map = new Dictionary();
    public static String choice = "";
    
    private Dictionary() {
    }
    
    public static Dictionary getMap() {
        if (map == null) {
            map = new Dictionary();
        }
        return map;
    }

    public boolean containKey(String key) {
        return map.hashMap.containsKey(key);
    }

    /**
     *
     */
    public void addDict() {
        Scanner sc = new Scanner(System.in);
        String inp;
        do {
            System.out.println("Enter key and value, split by ':' ");
            inp = sc.nextLine();
            if (inp.contains(":")) {
                String[] split = inp.split(":");
                if (!hashMap.containsKey(split[0])) {
                    hashMap.put(split[0], split[1]);
                } else {
                    System.err.println("This word is already in dictionary!");
                }
                
                System.err.println("================================================");
                System.out.println("Enter 'x' to quit adding, any others to continue: ");
            }
        } while (!inp.equalsIgnoreCase("x"));
        
    }
    
    public String searchDict(String value) {
        return map.hashMap.get(value);
    }
    
    public void showDict() {
        System.out.println(map.hashMap.toString());
    }
    
}
