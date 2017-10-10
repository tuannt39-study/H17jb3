package h17jb3.ex3;
//Nhập một xâu từ bàn phím. Hãy tạo ra một xâu có các từ đối xứng với xâu vừa nhập. Ví dụ: Nhập: “ Ha Noi Viet Nam”. In ra: “Nam Viet Noi Ha”
import java.util.Scanner;

public class B10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Nhập xâu: ");
		str=sc.nextLine();
		String[] words = str.split("\\s");
		System.out.println("In xâu đối xứng: ");
		for (int i=words.length-1; i>=0; i--){
			System.out.print(words[i] + " ");
		}
	}

}
