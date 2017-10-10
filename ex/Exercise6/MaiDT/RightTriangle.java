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
public class RightTriangle extends Shape {

    public int cVuong;

    public int getcVuong() {
        return cVuong;
    }

    public void setcVuong(int _cVuong) {
        this.cVuong = (_cVuong < 20 && _cVuong > 1 ? _cVuong : 1);
    }

    public RightTriangle(int cVuong) {
        this.cVuong = cVuong;
    }

    public void draw2() {
        System.out.println("Drawing a Shape");
        for (int i = 0; i < this.cVuong; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
