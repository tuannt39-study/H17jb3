package h17jb3.ex3;
//Nhập vào một xâu. Đếm xem trong xâu có bao nhiêu ký tự chữ cái, bao nhiêu ký tự chữ số và bao nhiêu từ (các từ ngăn cách với nhau bởi khoảng trắng).
import java.util.Scanner;

public class B05 {
	public static void main(String[] args) {
		String str;
		char ch;
		int wordCount=0, numCount=0, charCount=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập xâu: ");
		str=sc.nextLine();
		
		String[] words = str.split("\\s");
		for (String a: words){
			if (!a.isEmpty()){
				wordCount++;
			}
		}
		System.out.println("Số từ trong xâu là: " + wordCount);
		
		for (int i=0; i<str.length(); i++){
			ch=str.charAt(i);
			if (Character.isLetter(ch)){
				charCount++;
			} else if (Character.isDigit(ch)){
				numCount++;
			}
		}
		System.out.println("Số ký tự trong xâu: " + charCount);
		System.out.println("Số chữ số trong xâu: " + numCount);
	}
}