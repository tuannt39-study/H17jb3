import java.util.Scanner;

public class ex1 {
	private static Scanner sn;
	public static int Count(String str, char ch){
		int count=0;
		for(int i=0; i<str.length();i++){
			if(ch==str.charAt(i)){
				count+=1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		sn = new Scanner(System.in);
		System.out.print("Nhap chuoi:");
		String str= sn.nextLine();
		System.out.println("");
		System.out.print("Nhap ky tu can tim:");
		String in= sn.nextLine();
		System.out.println("");
		char ch= in.charAt(0);
		System.out.println("so lan xuat hien cua"+ch+"la: "+Count(str, ch));
	}
}
