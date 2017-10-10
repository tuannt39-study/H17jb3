package JavaExerciseP1;

import java.util.Scanner;

/**
 * Created by MyPC on 19/04/2017.
 */
public class Ex8 {
    public static void main(String[] args) {
        System.out.println(tongphanso(0));
    }
    private static float giaithua(int n){
        if (n==1){
            return 1;
        }else {
            return giaithua(n-1)* (n);
        }
    }
    private static float phansogiaithua(int n){
        return n/giaithua(n);
    }
    private static float tongphanso(int n){
        if (n==1){return 1;}else {
            return tongphanso(n-1)+phansogiaithua(n);
        }
    }
    }
