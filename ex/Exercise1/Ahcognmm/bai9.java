package bai_tap;

import java.util.Scanner;

public class bai9 {
	public static int fibonacci(int n){
		if(n==1) return 1;
		if(n==2) return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args) {
		System.out.println("nhap so n");
		int n= (new Scanner(System.in)).nextInt();
		System.out.println("so Fibonacci thu n la:"+fibonacci(n));
	}

}
