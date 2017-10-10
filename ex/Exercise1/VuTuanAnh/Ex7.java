package JavaExerciseP1;

import java.util.Scanner;

/**
 * Created by MyPC on 18/04/2017.
 */
public class Ex7 {
    public static void main(String[] args) {
        int n;
        int tong= 1;
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        for (int i = 1; i <= n; i++) {
            tong*=(int) i;
        }
        System.out.println("tong day so la: " + tong);
    }
}

