import java.util.Scanner;

public class ex8 {
	private static String delete(String str,String ch){
		str= str.replaceAll(ch, "");
		return str;
	}
	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		System.out.println("Nhập xâu:");
		String str = sn.nextLine();
		System.out.println("Nhap ky tu can xoa:");
		String ch= sn.nextLine();
		
		str= delete(str, ch);
		
		System.out.println("Xau da sua la: "+str);
	}
}
