/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai1_hinhtron {
    private double R, S, P;
	private final float pi = 3.14f;
	private Scanner sc;
	
	public bai1_hinhtron(double R){
		this.R = R;
	}
	public bai1_hinhtron(){}
	
	public void tinhChuVi(){
		P = 2 * R * pi;
		System.out.println("Chu vi hinh tron la: " + P);
	}
	
	public void tinhDienTich(){
		S = R * R * pi;
		System.out.println("Dien tich hinh tron la: " + S);
	}
	
	public void nhapBanKinh(){
		sc = new Scanner(System.in);
		System.out.print("Nhap ban kinh: ");
		R = sc.nextDouble();
	}
	
	public static void main(String[] args) {
		bai1_hinhtron C = new bai1_hinhtron();
		C.nhapBanKinh();
		C.tinhChuVi();
		C.tinhDienTich();
		
	}
}
