import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;



public class ex6 {
	public static int Max(int[] list){
		int max=-1000000000;
		for(int a:list){
			if(a>=max){
				max=a;
			}
		}
		if(max==0){
		
		}
		return max;
	}
	public static int viTri(int[] arr,int x){
		int c=0;
		for(int i= 0;i<arr.length;i++){
			if(arr[i]==x){
				c=i;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		System.out.println("nhap chuoi");
		String str =sn.nextLine();
		
		int[] arr= new int[str.length()];
		
		for(int i=0; i<str.length();i++){
			for(int j=0; j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					arr[i]+=1;
				}
			}
		}
		int x= viTri(arr, Max(arr));
		System.out.println("Chữ cái xuất hiện nhiều nhất là:"+str.charAt(x));
	}
}
