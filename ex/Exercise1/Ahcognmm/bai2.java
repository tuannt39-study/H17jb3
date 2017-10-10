package bai_tap;

public class bai2 {
	private static int S=0;
	public static void main(String agrsp[]){
		for (int i=0; i<20; i++){
			if(i%2==0){
				S+=i;
			}
		}
		System.out.println(S);
	}

}
