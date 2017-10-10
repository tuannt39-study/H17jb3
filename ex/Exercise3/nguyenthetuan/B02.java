package h17jb3.ex3;
//Viết chương trình tìm kiếm tên trong chuỗi họ tên đã nhập trước đó. Nếu có thì xuất ra là tên này đã nhập đúng, ngược lại thông báo là đã nhập sai.
import java.util.Scanner;

public class B02 {
	public static void main(String[] args) {
		String str, strTen;
		int kt=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ và tên: ");
		str = sc.nextLine();
		System.out.println("Nhập tên để kiểm tra: ");
		strTen = sc.nextLine();
		String[] words = str.split("\\s");
		for (String a: words){
			System.out.println(a);
			if (a.equals(strTen)) {
				kt=1;
			}
		}
		if(kt==1){
			System.out.println("Nhập đúng");
		} else System.out.println("Nhập sai");
	}
}