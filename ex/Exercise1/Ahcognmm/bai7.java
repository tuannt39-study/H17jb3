package bai_tap;

import java.util.Scanner;

public class bai7 {
	public static int n;
	public static int S=1;
	
	public static void main(String agrs[]){
		System.out.println("nhap n:");
		n = (new Scanner(System.in)).nextInt();
		for(int i=1;i<=n;i++){ S*=i;}
		System.out.println("tich n so tu nhien la:S="+S);
	}

}
