package h17jb3.ex3;
//Viết chương trình lấy ký tự đầu của mỗi từ trong họ tên (được nhập từ bàn phím) và in chuỗi tìm được ra màn hình.
import java.util.Scanner;

public class B03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Nhập họ tên: ");
		str = sc.nextLine();
		String[] words = str.split("\\s");
		for (String a: words){
			System.out.print(a.charAt(0) + " ");
		}
	}
}
