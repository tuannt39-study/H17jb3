/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part6OOP;

/**
 *
 * @author LilyEvans
 */
public class HinhTron {

    private double r;
    private double p;
    private double s;
    private final double pi = Math.PI;

    public HinhTron(double r) {
        this.r = r;
        this.p = this.r * 2 * pi;
        this.s = this.r * this.r * pi;
    }

    public double getChuVi() {
        return this.p;
    }

    public double getDienTich() {
        return this.s;
    }

}
