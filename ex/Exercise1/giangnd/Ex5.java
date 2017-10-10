package vn.hackademicshn.excercise;

import java.util.Scanner;

public class Ex5 {
	private static Scanner sc;

	public static void main(String[] args) {
		int s = 0;
		sc = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = sc.nextInt();
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				s = s + i;
				
			}
			System.out.println("tổng của " + n + " số nguyên dương đầu tiên là " + s);
		}else {
			System.out.println("Nhập lại n là số nguyên dương");
		}
		
	}
}
