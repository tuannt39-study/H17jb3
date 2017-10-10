package bai_tap;

import java.util.Scanner;

public class bai6 {
	private static int n;
	private static double S;

	public static void main(String args[]){
		System.out.println("nhap n:");
		n = (new Scanner(System.in)).nextInt();
		for(int i=1;i<=n;i++){
			S=S+ 1/(double)i;
			System.out.println(1/(double)i);
			}
		System.out.println("tong n so tu nhien la:S="+S);
	}

}
