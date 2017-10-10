import java.util.Scanner;

public class ex3 {
	public static String fistCh(String str){
		String outStr="";
		str=str.trim();
		String[] arrStr= str.split(" ");
		for(String s:arrStr){
			outStr+= s.charAt(0);
		}
		return outStr;
	}
	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		System.out.println("Nhap Ho va Ten");
		String str= sn.nextLine();
		System.out.println(fistCh(str));
	}
}
