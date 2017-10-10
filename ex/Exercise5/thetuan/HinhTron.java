package h17jb3.ex5;
//Bai - 1
//Viết lớp HinhTron có các phương thức tính chu vi và diện tích
import java.util.Scanner;

public class HinhTron {

	private void chuVi(int n) {
		double c = 0;
		c = (double) (2 * Math.PI * n);
		System.out.println("Chu vi hinh tron = " + c);
	}

	private void dienTich(int n) {
		double s = 0;
		s = (double) (n * n * Math.PI);
		System.out.println("Dien tich hinh tron = " + s);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HinhTron hinhtron = new HinhTron();
		System.out.print("Nhap n: ");
		for (int i = 0; i < 10; i++) {
			int n = sc.nextInt();
			if (n > 0) {
				hinhtron.chuVi(n);
				hinhtron.dienTich(n);
				break;
			} else {
				System.out.print("Nhap lai n: ");
			}
		}
	}
}
