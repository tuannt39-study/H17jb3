/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_2;

import java.util.Scanner;

/**
 *
 * @author Win 8.1 VS8 X64
 */
public class Rectangle extends Shape {

    public int chieuDai, chieuRong;

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int _chieuDai) {
        this.chieuDai = (_chieuDai < 15 && _chieuDai > 1 ? _chieuDai : 1);
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int _chieuRong) {
        this.chieuRong = (_chieuRong < 15 && _chieuRong > 1 ? _chieuRong : 1);
    }

    public Rectangle() {
    }

    ;
    public Rectangle(int _chieuDai, int _chieuRong) {
        this.chieuDai = _chieuDai;
        this.chieuRong = _chieuRong;
    }

    public void draw() {
        for (int i = 0; i < this.chieuRong; i++) {
            if ((i == 0) | (i == this.chieuRong - 1)) {
                for (int j = 0; j < this.chieuDai; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < this.chieuDai; j++) {
                    if (j == 0 | j == this.chieuDai - 1) {
                        System.out.print("*");
                    }
                else {
                     System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

}
