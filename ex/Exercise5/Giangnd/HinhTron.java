package vn.hackademics.exercise5;

import java.util.Scanner;

public class HinhTron{
	
	private double bankinh, dientich, chuvi;
	private final float pi = 3.14f;
	private Scanner sc;
	
	public HinhTron(double bankinh){
		this.bankinh = bankinh;
	}
	public HinhTron(){}
	
	public void tinhChuVi(){
		chuvi = 2 * bankinh * pi;
		System.out.println("Chu vi hinh tron la: " + chuvi);
	}
	
	public void tinhDienTich(){
		dientich = bankinh * bankinh * pi;
		System.out.println("Dien tich hinh tron la: " + dientich);
	}
	
	public void nhapBanKinh(){
		sc = new Scanner(System.in);
		System.out.print("Nhap ban kinh hinh tron: ");
		bankinh = sc.nextDouble();
	}
	
	public static void main(String[] args) {
		HinhTron cir = new HinhTron();
		cir.nhapBanKinh();
		cir.tinhChuVi();
		cir.tinhDienTich();
		
	}
	

}
