import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		System.out.println("Nhập xâu:");
		String str = sn.nextLine();
		
		ex7 b7= new ex7();
		str= b7.handleStr(str);
		
		String[] arr= str.split("\\s");
		StringBuilder builder= new StringBuilder();
		
		for(int i= arr.length-1;i>=0;i--){
			builder.append(arr[i]+" ");
		}
		System.out.println(builder.toString().trim());
	}
}
