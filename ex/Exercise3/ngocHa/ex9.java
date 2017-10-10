import java.util.Scanner;

public class ex9 {
	
	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		System.out.println("Nhập xâu:");
		String str = sn.nextLine();
		
		StringBuilder builder= new StringBuilder();
		
		for(int i=0; i<str.length();i++){
			builder.append(str.charAt(str.length()-1-i));
		}
		System.out.println(builder.toString());
	}

}
