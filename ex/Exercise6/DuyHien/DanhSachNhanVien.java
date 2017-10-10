/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;
import oops2.NhanVien;

/**
 *
 * @author LENOVO
 */
public class DanhSachNhanVien {

    private ArrayList<NhanVien> list = new ArrayList<NhanVien>();
    static Scanner sc = new Scanner(System.in);
    static Scanner input = new Scanner(System.in);

    public void themNhanVien() {

        System.out.println("Them 1 nhan vien moi: ");
        System.out.println("Ma NHan vien: ");
        String ma;
        ma = sc.nextLine();
        System.out.println("So san pham cua sinh vien do: ");
        int SP;
        SP = input.nextInt();
        NhanVien a = new NhanVien(ma, SP);
        list.add(a);

    }

    public void HienThiTT() {
        System.out.println("------------------------------------------- ");
        System.out.println("NHAN VIEN REPORT                            ");
        System.out.println("--------------------------------------------");
        for (int i = 1; i <= list.size(); i++) {
            System.out.print(i + " " + " " + " " + " ");
            System.out.println(list.get(i - 1).toString());
        }
        System.out.println("--------------------------------------------");
    }

    public void VuotChuan() {
        System.out.println("------------------------------------------- ");
        System.out.println("NHAN VIEN VUOT CHUAN                        ");
        System.out.println("--------------------------------------------");
        for (int i = 1; i <= list.size(); i++) {
            if (list.get(i).getSoSP() > 500) {
                System.out.print(i + " " + " " + " " + " ");
                System.out.println(list.get(i - 1).toString());
                System.out.println("--------------------------------------------");
            }
        }
    }

    public void KhongVuotChuan() {
        int count = 0;
        for (int i = 1; i <= list.size(); i++) {
            if (list.get(i).getSoSP() <= 500) {
                count += 1;

            }
        }
        System.out.println("Tong so nhan vien khong vuot chuan: " + count);
    }

    public void TongLuongVC() {
        int count = 0;
        for (int i = 1; i <= list.size(); i++) {
            if (list.get(i).getSoSP() > 500) {
                count += list.get(i).getLuong();

            }
        }
        System.out.println("Tong luong cua nhan vien vuot chuan: " + count);
    }

    public void TongSoNV() {
        int count = 0;
        for (Object o : list) {
            count += 1;
        }
        System.out.println("Tong so sinh vien la: " + count + " Nhan vien !");
    }

    public void minSP() {
        int min = 9999;
        String b = "";
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i).getSoSP();
            if (a < min) {
                min = a;
                b = list.get(i).getMaNV();
            }
        }
        System.out.println("Nhan vien co so san pham it nhat la nhan vien: " + b + " voi " + min + " san pham");
    }

    public void luong() {
        double max = 0;
        String b = "";
        for (int i = 0; i < list.size(); i++) {
            double a = list.get(i).getLuong();
            if (a > max) {
                max = a;
                b = list.get(i).getMaNV();
            }
        }
        System.out.println("Nhan vien co luong cao nhat la nhan vien: " + b + " voi thu nhap la: " + max);
    }

    public void timNV() {
        Scanner out = new Scanner(System.in);
        System.out.println("Hay nhap ID cua nhan vien ma ban can tim? ");
        String ID;
        ID = out.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (ID.equalsIgnoreCase(list.get(i).getMaNV())) {
                System.out.println("Thong tin cua nhan vien: " + list.get(i).toString());
            }
        }
    }

    public void TongLuong() {
        long count = 0;
        for (int i = 0; i < list.size(); i++) {
            double a = list.get(i).getLuong();
            count += a;
        }
        System.out.println("Tong luong cua tat ca nhan vien la : " + count);
    }

    public void sapXep() {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j <= list.size(); i++) {
                if (list.get(i).getSoSP() > list.get(j).getSoSP()) {
                    Object o = list.get(i);
                    Object b = list.get(j);
                    Object c = o;
                    o = b;
                    b = c;

                }
            }
        }
        System.out.println("New report: ");
        System.out.println("------------------------------------------- ");
        System.out.println("NHAN VIEN REPORT                            ");
        System.out.println("--------------------------------------------");
        for (int i = 1; i <= list.size(); i++) {
            System.out.print(i + " " + " " + " " + " ");
            System.out.println(list.get(i - 1).toString());
        }
        System.out.println("--------------------------------------------");
    }

    public void removeNV() {
        System.out.println("Nhap vi tri cua nhan vien ma ban muon xoa: ");
        int pos = sc.nextInt();
        int count = list.size();
        while (pos > count) {
            System.out.println("Nhan vien khong ton tai. Nhap lai: ");
            pos = sc.nextInt();
        }
        for (int i = 1; i <= count; i++) {
            if (i == pos) {
                list.remove(pos);
            }
        }
        if (list.size() == 0) {
            System.out.println("Empty.");
            System.exit(0);
        }
        System.out.println("New report: ");
        System.out.println("------------------------------------------- ");
        System.out.println("NHAN VIEN REPORT                            ");
        System.out.println("--------------------------------------------");
        for (int i = 1; i <= list.size(); i++) {
            System.out.print(i + " " + " " + " " + " ");
            System.out.println(list.get(i - 1).toString());
        }
        System.out.println("--------------------------------------------");
    }

    public static void main(String[] args) {
        DanhSachNhanVien dsvm = new DanhSachNhanVien();
        Scanner cc = new Scanner(System.in);
        char select = 0;
        do {
            dsvm.themNhanVien();

            System.out.println("Ban co muon them 1 nhan vien khong? (Y or N) ?");
            String ask = cc.nextLine();
            while (!ask.equalsIgnoreCase("Y") && !ask.equalsIgnoreCase("N")) {
                System.out.println("Nhap sai. Nhap Y hoac N ! ");
                ask = input.nextLine();
            }
            select = ask.toUpperCase().charAt(0);

        } while (select == 'Y' || select == 'y');

        int iChoice = 0;

        System.out.println("------------------MENU----------------------");
        System.out.println("1. Them nhan vien. ");
        System.out.println("2. Lay thong tin nhan vien. ");
        System.out.println("3. Lay tong so nhan vien. ");
        System.out.println("4. Lay thong tin cua cac nhan vien co so SP vuot chuan. ");
        System.out.println("5. Dem so nhan vien co san pham khong vuot chuan. ");
        System.out.println("6. Tong luong cua cac nhan vien vuot chuan. ");
        System.out.println("7. Nhan vien co so san pham it nhat. ");
        System.out.println("8. Nhan vien co luong cao nhat. ");
        System.out.println("9. Tim nhan vien theo ma nhap: ");
        System.out.println("10. Xoa 1 nhan vien theo vi tri nhap vao. ");
        System.out.println();
        System.out.println("Nhap lua chon: ");
        iChoice = sc.nextInt();
        switch (iChoice) {
            case 1:
                dsvm.themNhanVien();
                break;
            case 2:
                dsvm.HienThiTT();
                break;
            case 3:
                dsvm.TongSoNV();
                break;
            case 4:
                dsvm.VuotChuan();
                break;
            case 5:
                dsvm.KhongVuotChuan();
            case 6:
                dsvm.TongLuongVC();
                break;
            case 7:
                dsvm.minSP();
                break;
            case 8:
                dsvm.luong();
            case 9:
                dsvm.timNV();
            case 10:
                dsvm.removeNV();

            default:
                break;
        }

    }
}
