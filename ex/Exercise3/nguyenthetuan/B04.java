package h17jb3.ex3;
//Cho biết đường dẫn đầy đủ của một tập tin có dạng: “/home/user/filename.png”. Hãy viết chương trình hiển thị ra màn hình tên, phần mở rộng và đường dẫn tập tin.
import java.util.Scanner;

public class B04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Nhập đường dẫn của tện tin: ");
		str = sc.nextLine();
		
		int vtPhanMoRong=str.indexOf('.');
		String phanMoRong = str.substring(vtPhanMoRong+1);
		System.out.println("Phần mở rộng là: " + phanMoRong);
		
		int vtPhanTen=str.lastIndexOf('/');
		String phanTen = str.substring(vtPhanTen+1, vtPhanMoRong);
		System.out.println("Phần tên: " + phanTen);
		
		String duongDan = str.substring(0, vtPhanTen+1);
		System.out.println("Đường dẫn: " + duongDan);
	}
}
