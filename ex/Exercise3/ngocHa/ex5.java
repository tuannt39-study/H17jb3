import java.util.Scanner;

import javax.xml.bind.SchemaOutputResolver;


public class ex5 {
	public static void Count(String str){
		// Delete all num and space
		String ChStr= str.replaceAll("\\d", "");
		String StChStr= ChStr.replaceAll("\\s", "");
		// Delete all char and sapce
		String NumStr= str.replaceAll("\\s", "");
		String StNumStr= NumStr.replaceAll("\\d", " ");
		String CNum= StNumStr.replaceAll("\\w", "");
		//System.out.println(StNumStr);
		//
		System.out.println("So cac so la:"+CNum.length());
		System.out.println("So cac chu la:"+StChStr.length());
	}
	public static int wCount(String str){
		int c=0;
		String StStr= str.replaceAll("\\s+", " ").trim();
		String[] arrStr= str.split(" ");
		c= arrStr.length;
		return c;
	}
	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		System.out.print("nhap xau:");
		String str= sn.nextLine();
		Count(str);
		System.out.println("So tu la:"+wCount(str));
	}

}
