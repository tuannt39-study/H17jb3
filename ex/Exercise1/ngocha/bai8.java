package bai_tap;

import java.util.Scanner;

public class bai8 {
	public static int n;
	public static double S=1;
	public static double gt=1;
	

	public static void main(String agrs[]){
		System.out.println("nhap n:");
		n = (new Scanner(System.in)).nextInt();
		for(int i=1;i<=n;i++){ 
			gt*=(double)i;
			S= 1/gt;
			}
		System.out.println("dap so la:S="+S);
	}
}
