package exercise_git;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thiennq
 */
public class Ex3_1_From1To10 {

    public static Ex3_1_From1To10 Create() {
        return new Ex3_1_From1To10();
    }

    Ex3_1_From1To10() {
        Scanner input = new Scanner(System.in);
        System.out.println("H?y nh?p v?o 1 x?u k? t?:");
        String[] strXau = input.nextLine().split("");
        System.out.println("H?y nh?p v?o 1 k? t?:");
        String str = input.nextLine().toString();
        int countStr = 0;
        for (String a : strXau) {
            if (str.equals(a)) {
                countStr += 1;
            }
        }

        System.out.println("S? l?n xu?t hi?n c?a k? t? '" + str + "' trong chu?i l?: " + countStr);
    }

    public static void Ex3_1_2() {
        String[] strHoTen = "Nguyen Quang Thien".split(" ");
        Scanner input = new Scanner(System.in);
        System.out.println("H?y nh?p t?n:");
        String strTen = input.nextLine();
        if (strTen.equals(strHoTen[strHoTen.length - 1])) {
            System.out.println("T?n n?y ?? nh?p ??ng");
        } else {
            System.out.println("T?n n?y ?? nh?p sai");
        }
    }

    public static void Ex3_1_3() {
        Scanner input = new Scanner(System.in);
        System.out.println("H?y nh?p H? T?n:");
        String[] strHoTen = input.nextLine().split(" ");
        String strChuoi = "";

        for (String str : strHoTen) {
            strChuoi += str.split("")[0];
        }

        System.out.println("Chu?i k? t? ??u c?a m?i t? trong h? t?n l?: '" + strChuoi + "'");
    }

    public static void Ex3_1_4() {
        String strPath = "/home/user/filename.png";

        System.out.println("T?n: " + strPath.substring(strPath.lastIndexOf("/") + 1, strPath.lastIndexOf(".")));
        System.out.println("Ph?n m? r?ng: " + strPath.substring(strPath.lastIndexOf(".") + 1, strPath.length()));
        System.out.println("???ng d?n t?p tin: " + strPath.substring(0, strPath.lastIndexOf("/") + 1));

    }

    public static void Ex3_1_5() {
        Scanner input = new Scanner(System.in);
        System.out.println("H?y nh?p v?o 1 x?u k? t?:");
        String strXau = input.nextLine();
        int countLetter = 0;
        int countNumber = 0;

        for (char chr : strXau.toCharArray()) {
            if (Character.isLetter(chr)) {
                countLetter += 1;
            } else if (Character.isDigit(chr)) {
                countNumber += 1;
            }
        }

        System.out.println("S? k? t? ch? c?i trong x?u l?: " + countLetter);
        System.out.println("S? k? t? ch? s? trong x?u l?: " + countNumber);
        System.out.println("S? t? trong x?u l?: " + strXau.split(" ").length);

    }

    public static void Ex3_1_6() {

        Scanner input = new Scanner(System.in);
        System.out.println("H?y nh?p v?o 1 x?u k? t?:");
        String strXau = input.nextLine();

        int lenOld = strXau.length();
        char[] chr = new char[lenOld];
        chr[0] = strXau.charAt(0);
        int lenNew = strXau.length();
        int count = 0;
        int i = 0;
        while (lenNew != 0) {
            lenOld = strXau.length();
            char tmp = strXau.charAt(0);
            strXau = strXau.replace(String.valueOf(tmp), "");
            lenNew = strXau.length();

            if (lenOld - lenNew > count) {
                chr = new char[lenOld];
                i = 0;
                chr[i] = tmp;
                count = lenOld - lenNew;
            } else if (lenOld - lenNew == count) {
                i++;

                chr[i] = tmp;
                count = lenOld - lenNew;
            }
        }

        for (int j = 0; j <= i; j++) {
            System.out.println("K? t?: " + chr[j] + " xu?t hi?n nhi?u nh?t l?: " + count);
        }
    }

    public static void Ex3_1_7() {
        String[] nguyenAm = new String[]{"a", "e", "i", "o", "u", "y"};

        Scanner input = new Scanner(System.in);
        System.out.println("H?y nh?p v?o 1 x?u k? t?:");
        String strXau = input.nextLine();

        for (String na : nguyenAm) {
            strXau.replace(" ", "");
            strXau.replace(na, "");
        }
        System.out.println("X?u k? t? m?i: " + nguyenAm);

    }

    public static void Ex3_1_8() {
        Scanner input = new Scanner(System.in);
        System.out.println("H?y nh?p v?o 1 x?u k? t?:");
        String strXau = input.nextLine();

        System.out.println("H?y nh?p v?o 1 k? t? mu?n x?a:");
        String str = input.nextLine().toString();

        System.out.println("X?u k? t? m?i: " + strXau.replace(str, ""));

    }

    public static void Ex3_1_9() {
        Scanner input = new Scanner(System.in);
        System.out.println("H?y nh?p v?o 1 x?u k? t?:");
        String strXau = input.nextLine();

        System.out.println("X?u k? t? ??o ng??c: " + new StringBuffer(strXau).reverse().toString());
    }

    public static void Ex3_1_10() {
        Scanner input = new Scanner(System.in);
        System.out.println("H?y nh?p v?o 1 x?u k? t?:");
        String[] strOld = input.nextLine().split(" ");
        String strNew = "";

        int len = strOld.length;

        for (int i = 1; i <= len; i++) {
            strNew += strOld[len - i] + " ";
        }
        System.out.println("X?u k? t? m?i: " + strNew.substring(0, strNew.length() - 1));
    }
    //
}
