/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.Scanner;

/**
 *
 * @author viet
 */
public class HinhTron {

    private float R;

    public HinhTron() {

    }

    public HinhTron(float R) {
        this.R = R;
    }

    public float getR() {
        return R;
    }

    public void setR(float R) {
        this.R = R;
    }

    private double ChuVi(float R) {
        return Math.PI * 2 * R;
    }

    public double getChuVi() {
        return this.ChuVi(R);
    }

    private double DienTich(float R) {
        return Math.PI * Math.pow(R, 2);
    }

    public double getDienTich() {
        return this.DienTich(R);
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HinhTron tron = new HinhTron();
        float R = 0;
        try {
            System.out.print("Nhap ban kinh hinh tron : ");
            R = in.nextFloat();
        } catch (Exception e) {
            System.out.println("Error !");
        }
        tron.setR(R);
        System.out.println("Hinh tron co ban kinh "+R+" don vi");
        System.out.println("Chu vi : "+tron.getChuVi());
        System.out.println("Dien tich: "+tron.getDienTich());
        
        
        
    }
   
}


