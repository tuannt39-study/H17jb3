package JavaExerciseP1;

import java.util.Scanner;

/**
 * Created by MyPC on 18/04/2017.
 */
public class Ex6 {
    public static void main(String[] args) {
        int n;
        float tong=0.0f;
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        for (int i = 1; i <= n; i++) {
            tong+=(float) 1/i;
        }
        System.out.println("tong day so la: " + tong);
    }
}
