import java.util.Scanner;

public class ex2 {
	public static boolean search(String str1, String str2){
		boolean bl=false;
		str1= str1.toLowerCase();
		str2=str2.toLowerCase();
		String standardStr1= str1.trim();
		String[] arrStr= str1.split(" ", -1);
		if(arrStr[arrStr.length-1].equals(str2)){
			bl=true;
		}
		return bl;
	}
	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		System.out.println("Nhap Ho va Ten");
		String str1= sn.nextLine();
		System.out.println("Nhap ten can tim");
		String str2= sn.nextLine();
		boolean bl= search(str1, str2);
		if(bl){
			System.out.println("ten da nhap dung");
		}else{System.out.println("ban da nhap sai");}
	}
}
