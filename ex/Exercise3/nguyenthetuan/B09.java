package h17jb3.ex3;
//Nhập vào một xâu. Tạo ra xâu đảo ngược với xâu đã nhập. Ví dụ: nhập ABCDE, xuất ra màn hình là:EDCBA
import java.util.Scanner;

public class B09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Nhập xâu: ");
		str=sc.nextLine();
		System.out.println("In xâu đảo ngược: ");
		for (int i=str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}
	}
}
