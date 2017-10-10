package h17jb3.ex3;
//Viết chương trình tìm kiếm xem ký tự nào xuất nhiện nhiều nhất trong chuỗi. 
import java.util.Scanner;

public class B06 {
	public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        int max;
        System.out.println("Nhap vao chuoi: ");
        str = sc.nextLine();
        int[] arrChar = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char c;
            c = str.charAt(i);
            arrChar[(int) c]++;
            System.out.println(c + " " + arrChar[(int) c]);
        }
        
        max = arrChar[0];
        int k = 0;
        int[] c = new int[256];
        
        for (int i = 0; i < arrChar.length; i++)
        {
            if (i != 32) {
                if (max <= arrChar[i]) {
                    k = i;
                    c[i]=k;
                    max = arrChar[i];
                }
            }
        }
        
        for(int i=0;i<arrChar.length;i++){
        	if(arrChar[i]==max){
        		System.out.println("Ky tu: " +(char)c[i] + " Xuat hien nhieu nhat " + max + " lan");
        	}
        }
            
	}
}
