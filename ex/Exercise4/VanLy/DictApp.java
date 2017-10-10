/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author LilyEvans
 */
public class DictApp {

    public static void main(String[] args) {
        Dictionary map = Dictionary.getMap();
        Scanner sc = new Scanner(System.in);
        do {
            do {
                System.out.print("Enter 1 to add, 2 to search: ");
                map.choice = sc.nextLine();

            } while (!map.choice.equals("1") && !map.choice.equals("2"));
            if ("1".equals(map.choice)) {
                map.addDict();
                map.showDict();
            } else {
                System.out.println("Enter word do you want to search:");
                map.choice = sc.nextLine();
                System.out.println(map.searchDict(map.choice));
                if (!map.containKey(map.choice)) {
                    do {
                        System.out.println("Do you want to add this as a new word (Y/N)");
                        map.choice = sc.nextLine();
                    } while (!map.choice.equalsIgnoreCase("Y") && !map.choice.equalsIgnoreCase("N"));
                    if (map.choice.equalsIgnoreCase("Y")) {
                        map.addDict();
                    }
                }
            }
        } while (!map.choice.equals("x"));
    }
}
