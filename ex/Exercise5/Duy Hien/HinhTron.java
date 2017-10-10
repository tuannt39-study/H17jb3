/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

/**
 *
 * @author LENOVO
 */
public class HinhTron {

    private double r;

    public HinhTron(double r) {
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void tinhChuVi() {
        System.out.println("Chu vi hinh tron la: " + (this.r * 2 * 3.14) + " (dvdt).");
    }

    public void tinhDienTich() {
        System.out.println("Dien tich hinh tron la: " + (this.r * this.r * 3.14) + " (dvdt).");
    }
}
