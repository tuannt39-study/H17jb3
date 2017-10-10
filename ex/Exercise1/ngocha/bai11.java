package bai_tap;

import java.util.Scanner;

public class bai11 {
	public bai11(int soNhap){
		boolean f= false;
		double b= Math.sqrt(soNhap);
		for (int i=2; i <= b; i++){
			if(soNhap%i==0){ 
				f=true;
				break;
			}
			else f=false;
		}
		if(f)System.out.println("ko la snt");
		else System.out.println("la snt");
	}
	public static void main(String[] args) {
		System.out.print("nhap so n:");
		int n =(new Scanner(System.in)).nextInt();
		new bai11(n);
	}
}
