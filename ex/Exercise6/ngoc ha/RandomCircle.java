package nothing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class RandomCircle {
	 public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		System.out.println("Nhap N:");
		int N = sn.nextInt();
		
		CircleCollection cc = new CircleCollection();
		Random rd= new Random();
		for(int i=0;i<N; i++){
			double r= (rd.nextDouble()+1)*(rd.nextInt(200)+1);
			cc.addCircle(new Circle(r));
		}
		ArrayList<Circle> arrayList = new ArrayList<>(cc.getArrayList());
		for(Circle c: arrayList){
			System.out.println(c.toString());
		}
		System.out.println("\n"+cc.toString());
	}

}
