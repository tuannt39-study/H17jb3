package vn.hackademicshn.excercise;

import java.util.Scanner;

public class Ex2 {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.print("Tham số đầu tiên: ");
		double a = sc.nextDouble();
		System.out.print("Tham số thứ hai: ");
		double b = sc.nextDouble();
		System.out.print("Tham số thứ ba: ");
		double c = sc.nextDouble();

		double delta;
		if (0 == a){
			if( 0 == b){
				if (0 == c){
					System.out.println("Phương trình có vô số nghiệm");
				}else {
					System.out.println("Phương trình vô nghiệm");
				}
				
			}else {
				System.out.println("Phương trình có 1 nghiệm: " + (-c/b));
			}
			
		}else {
			double x1;
			double x2;
			delta = Math.pow(b, 2) - 4*a*c;
			if(delta < 0){
				System.out.println("Phương trình vô nghiệm");
			}else if (delta > 0) {
				x1 = (-b + Math.sqrt(delta)/ (2*a));
				x2 = (-b - Math.sqrt(delta)/ (2*a));
				System.out.println("Nghiệm đầu tiên là: " + x1);
				System.out.println("Nghiệm đầu tiên là: " + x2);
			}else {
				System.out.println("Phương trình có nghiệm kép" + (-b/(2*a)));
			}
			
		}
		
	}
}
