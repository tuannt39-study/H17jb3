/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.Scanner;

/**
 *
 * @author Win 8.1 VS8 X64
 */
public class HinhTron {

    /**
     * @param args the command line arguments
     */
    private int radius;
    private double chuVi;
    private double dienTich;

    public HinhTron() {
        System.out.print("Nhập vào radius = ");
        Scanner input = new Scanner(System.in);
        radius = input.nextInt();
        this.chuVi = Math.PI * 2 * this.radius;
        this.dienTich = Math.PI * this.radius * this.radius;
    }

    ;
    public HinhTron(int radius) {
        this.radius = radius;
        this.chuVi = Math.PI * 2 * this.radius;
        this.dienTich = Math.PI * this.radius * this.radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        this.chuVi = Math.PI * 2 * this.radius;
        this.dienTich = Math.PI * this.radius * this.radius;
    }

    public double getChuVi() {
        return chuVi;
    }

    public double getDienTich() {
        return dienTich;
    }

}
