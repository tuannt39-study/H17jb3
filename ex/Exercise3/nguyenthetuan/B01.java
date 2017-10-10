package h17jb3.ex3;
//Viết chương trình nhập vào một xâu ký tự và một ký tự. Đếm và in ra màn hình số lần xuất hiện của ký tự vừa nhập trong xâu ký tự đó
import java.util.Scanner;

public class B01 {
	public static void main(String[] args) {
		String str;
		char ch, a;
		int dem=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		str = sc.nextLine();
        System.out.println("Nhập ký tự: ");
        ch = sc.next().charAt(0);
        for (int i=0; i<str.length(); i++){
        	if (ch==str.charAt(i)){
        		dem++;
        	}
        }
        System.out.println("Số lần xuất hiện của ký tự " + ch + " là: " + dem);
	}
}
