package vn.hackademicshn.excercise;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.print("Tham số đầu tiên: ");
		double a = sc.nextDouble();
		System.out.print("Tham số thứ hai: ");
		double b = sc.nextDouble();

		double x;
		if (0 != a && 0 != b) {
			x = -b / a;
			System.out.println("Phương trình có 1 nghiệm, x = " + x);
		} else if (0 == b) {
			System.out.println("Phương trình có 1 nghiệm, x = 0");
		} else {
			System.out.println("Phương trình có vô số nghiệm");
		}
	}
}
