/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import static exercise.DanhSachNhanVien.sc;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author LENOVO
 */
public class Dictionary {

    private static HashMap<String, String> cc = new HashMap<String, String>();
    static Scanner sc = new Scanner(System.in);

    public static void NhapTT() {
        char select = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap tu moi: ");
        String a = sc.nextLine();
        System.out.println("Nhap nghia cua tu: ");
        String b = input.nextLine();
        cc.put(a, b);
    }

    public static void print() {

        Set set = cc.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
    }

    public static void TraNghia() {
        System.out.println("Nhap tu muon tra: ");
        char y = 0;
        String mean = sc.nextLine();
        if (cc.containsKey(mean)) {
            System.out.println("Nghia la : " + cc.get(mean));
        } else {
            System.out.println("This words didn't exist: ");
            System.out.println("Ban co muon them tu khong?");
            String ask = sc.nextLine();
            while (!ask.equalsIgnoreCase("Y") && !ask.equalsIgnoreCase("N")) {
                System.err.println("Please enter a character Y or N ! ");
                ask = sc.nextLine();
            }
            y = ask.toUpperCase().charAt(0);
            if (y == 'Y') {
                NhapTT();
                print();
            } else {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        char select = 0;
        do {
            NhapTT();
            System.err.println("Do you want to continue? (Y or N) ?");
            String ask = sc.nextLine();
            while (!ask.equalsIgnoreCase("Y") && !ask.equalsIgnoreCase("N")) {
                System.err.println("Please enter a character Y or N ! ");
                ask = sc.nextLine();
            }
            select = ask.toUpperCase().charAt(0);

        } while (select == 'Y' || select == 'y');
        print();
        System.out.println("Ban muon tra nghia tu nao khong? (Y/N) ");
        String modify;
        modify = sc.nextLine();
        while (!modify.equalsIgnoreCase("Y") && !modify.equalsIgnoreCase("N")) {
            System.err.println("Please enter a character Y or N ! ");
            modify = sc.nextLine();
        }
        char l = modify.toUpperCase().charAt(0);
        switch (l) {
            case 'Y':
                do {
                    TraNghia();
                    System.err.println("Do you want to continue? (Y or N) ?");
                    String ask = sc.nextLine();
                    while (!ask.equalsIgnoreCase("Y") && !ask.equalsIgnoreCase("N")) {
                        System.err.println("Please enter a character Y or N ! ");
                        ask = sc.nextLine();
                    }
                    select = ask.toUpperCase().charAt(0);

                } while (select == 'Y' || select == 'y');
                break;
            case 'N':
                System.exit(0);
        }

    }
}
