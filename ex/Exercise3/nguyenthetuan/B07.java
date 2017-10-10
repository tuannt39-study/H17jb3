package h17jb3.ex3;
//Nhập một xâu từ bàn phím. Loại bỏ tất cả các khoảng trắng dư thừa trong xâu. Xóa tất cả các nguyên âm trong xâu.
import java.util.Scanner;

public class B07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		char ch;
		System.out.println("Nhap xau: ");
		str = sc.nextLine();
		String[] words = str.split("\\s");
		System.out.println("In xau da bo khoang trang: ");
		
		str=str.replace(" ", "");
		System.out.println(str);
		
//		for (String a: words){
//			System.out.print(a);
//		}
		
		String[] nguyenAm = {"u", "e", "o", "a", "i"};
		
		for(String a: nguyenAm){
			str=str.replace(a, "");
		}
		System.out.println("Xau da bo tat ca nguyen am: \n" + str);
		
	}

}
