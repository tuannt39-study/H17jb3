/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class HinhTronApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Moi ban nhap ban kinh cua duong tron: ");
        double BK = sc.nextDouble();
        HinhTron a = new HinhTron(BK);
        System.out.println("Ban muon tinh chu vi hay dien tich? (C or D)");
        char c = 0;
        String ans = input.nextLine();
        while (!ans.equalsIgnoreCase("C") && !ans.equalsIgnoreCase("D")) {
            System.out.println("Enter again: ");
            ans = input.nextLine();
        }
        c = ans.toUpperCase().charAt(0);
        switch (c) {
            case 'C':
                char d = 0;
                a.tinhChuVi();
                System.out.println("Ban co muon tinh luon Dien tich hinh tron khong? (Y/N)");
                String ans1 = input.nextLine();
                while (!ans1.equalsIgnoreCase("Y") && !ans1.equalsIgnoreCase("N")) {
                    System.out.println("Enter again: ");
                    ans1 = input.nextLine();
                }
                d = ans1.toUpperCase().charAt(0);
                switch (d) {
                    case 'Y':
                        a.tinhDienTich();
                        break;
                    case 'N':
                        System.out.println("Ok. End programs. ");
                        System.exit(0);
                    default:
                        break;
                }

                break;
            case 'D':
                a.tinhDienTich();
                char t = 0;
                System.out.println("Ban co muon tinh luon chu vi hinh tron khong? (Y/N)");
                String ans2 = input.nextLine();
                while (!ans2.equalsIgnoreCase("Y") && !ans2.equalsIgnoreCase("N")) {
                    System.out.println("Enter again: ");
                    ans1 = input.nextLine();
                }
                t = ans2.toUpperCase().charAt(0);
                switch (t) {
                    case 'Y':
                        a.tinhChuVi();
                        break;
                    case 'N':
                        System.out.println("Ok. End programs. ");
                        System.exit(0);
                    default:
                        break;
                }
                break;
            default:
                break;
        }

    }
}
