package bai_tap;

import java.util.Scanner;

public class bai10 {
	private static Scanner sn;
	public static int S=0;

	public static void main(String[] args) {
		System.out.println("nhap n");
		sn = new Scanner(System.in);
		String msg= sn.nextLine();
		for(int i=0;i<msg.length();i++){
			 int y= (int)Double.parseDouble(Character.toString(msg.charAt(i)));
			 S= S+y;
		}
		System.out.println(S);
		
		
	}

}
