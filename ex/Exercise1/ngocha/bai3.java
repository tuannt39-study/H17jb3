package bai_tap;

import java.util.Scanner;

public class bai3 {
	public double a;
	public double b;
	public static Scanner sn;
	public double z;
	public bai3(double x, double y){
		if (x==0){
			if(y==0) System.out.println("Nghiem dung voi moi x");
			else System.out.println("Vo nghiem");
		}else{
			z= -x/y;
			System.out.println("Phuong trinh co ngiem x="+z);
		}
	}
	public static void main(String agrs[]){
		sn= new Scanner(System.in);
		System.out.println("Nhap a:");
		double a= sn.nextDouble();
		System.out.println("Nhap b:");
		double b = sn.nextDouble();
		new bai3(a,b);
		
	}
}
