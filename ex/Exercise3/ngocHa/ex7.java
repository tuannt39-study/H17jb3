import java.util.Scanner;

public class ex7 {
	public static String handleStr(String str){
		str=str.trim();
		str= str.replaceAll("\\s+"," ");
		return str;
	}
	private static String delete(String str){
		str=str.replace("e", "");
		str=str.replace("u", "");
		str=str.replace("o", "");
		str=str.replace("a", "");
		str=str.replace("i", "");
		return str;
	}
	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		System.out.println("Nhập xâu:");
		String str = sn.nextLine();
		str= handleStr(str);
		System.out.println(str);
		str= delete(str);
		System.out.println(str);
		
	}

}
