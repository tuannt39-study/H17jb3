package h17jb3.ex6.Exceptions;

import java.util.Scanner;

class chiaKhong extends Exception {
	chiaKhong(String s) {
		super(s);
	}
}

public class Bai01 {

// 1 -
//	public boolean method(int b)throws IOException{  
//		if (b==0) {
//			return true;
//		}
//		else return false;
//	}  
//	
//	public static void main(String[] args) throws IOException {
//		Bai01 er = new Bai01();
//		Scanner sc = new Scanner(System.in);
//		int a, b;
//		double c=0;
//		System.out.print("Nhap a: ");
//		a=sc.nextInt();
//		System.out.print("Nhap b: ");
//		b=sc.nextInt();
//		
//		if (er.method(b)==true){
//			throw new IOException("Loi chia 0");
//		} else  {
//			c=(double)a/b;
//			System.out.println("c = " + c);
//		}
//	}

// 2 -
//	static void chiaKhong (int b)throws IOException {
//		if (b==0) {
//			throw new IOException ("Loi chia 0");
//		} else System.out.println("Thuc hien phep chia");
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a, b;
//		double c=0;
//		System.out.print("Nhap a: ");
//		a=sc.nextInt();
//		System.out.print("Nhap b: ");
//		b=sc.nextInt();
//		try {
//			chiaKhong(b);
//		} catch(Exception m) {
//			System.out.println("Exception xuat hien: " + m);
//		} c=(double)a/b;
//		System.out.println("c = " + c);
//	}
	
// 3 -
	static void phepChia(int b) throws chiaKhong {
		if (b==0)
			throw new chiaKhong("Loi: So bi chia = 0");
		else
			System.out.println("Thuc hien phep chia");
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		double c=0;
		System.out.print("Nhap a: ");
		a=sc.nextInt();
		System.out.print("Nhap b: ");
		b=sc.nextInt();
		try {
			phepChia(b);
			c=(double)a/b;
			System.out.println("c = " + c);
		} catch (Exception m) {
			System.out.println("Exception xuat hien: " + m);
		}
		
	}

}
