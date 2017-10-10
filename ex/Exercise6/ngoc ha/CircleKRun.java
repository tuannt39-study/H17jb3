package nothing;

import java.util.ArrayList;
import java.util.Scanner;

public class CircleKRun {

	public static void main(String[] args) {
		ArrayList<CircleK> circles = new ArrayList<>();
		Scanner sn = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sn.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap x"+(i+1)+": ");
			int x = sn.nextInt();
			System.out.println("Nhap y"+(i+1)+": ");
			int y = sn.nextInt();
			System.out.println("Nhap ban kinh: ");
			double r= sn.nextDouble();
			circles.add(new CircleK(x,y,r));
		}
		for(CircleK ck: circles){
			System.out.println(ck.toString());
		}

	}

}
