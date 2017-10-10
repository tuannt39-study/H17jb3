package bai_tap;

import java.util.Scanner;

public class bai4 {
	public static double a;
	public static double b;
	public static double c;
	public static double delta;
	public static double s_delta; // sqrt of delta
	//
	public static Scanner sn;
	private static double x1;
	private static double x2;
	
	public static void main(String args[]){
		sn= new Scanner(System.in);
		System.out.println("nhap a");
		a= sn.nextDouble();
		System.out.println("nhap b");
		b= sn.nextDouble();
		System.out.println("nhap c");
		c=sn.nextDouble();
		if (a==0){
			new bai3(b,c);
		}else{
			delta= b*b-4*a*c;
			if (delta<0){
				System.out.println("phuong trinh vo nghiem");
			}
			else {
				s_delta= Math.sqrt(delta);
				x1 = (-b-s_delta)/2*a;
				x2= (-b+s_delta)/2*a;
				System.out.println("nghiem cua phuong trinh la:");
				System.out.println("x1="+x1);
				System.out.println("x2="+x2);
				
			}
		}
	}
}
