package h17jb3.ex3;
//Nhập một chuỗi bất kì, yêu cầu nhập 1 kí tự muốn xóa. Thực hiện xóa tất cả những kí tự đó trong chuỗi
import java.util.Scanner;

public class B08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		char ch;
		System.out.println("Nhap xau: ");
		str = sc.nextLine();
		System.out.println("Nhap ky tu: ");
		ch = sc.next().charAt(0);
		for (int i=0; i<str.length(); i++){
			if (ch==str.charAt(i)){
				String kyTu = str.substring(i, i+1);
				str = str.replace(kyTu, "");
			}
		}
		System.out.println(str);
	}

}
