package bai_tap;

import java.util.Scanner;

public class bai5 {
	public static int n;
	public static int S=0;
	
	public static void main(String agrs[]){
		System.out.println("nhap n:");
		n = (new Scanner(System.in)).nextInt();
		for(int i=0;i<=n;i++){ S+=i;}
		System.out.println("tong n so tu nhien la:S="+S);
	}

}
