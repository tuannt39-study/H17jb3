package Excersice_1;

/**
 * Created by minht on 4/17/2017.
 */
public class ex7 {
    public static void main(String[] args) {
        System.out.println(giaithua(5));
    }
    private static int giaithua(int n){
        if (n==1){
            return 1;
        }else return giaithua(n-1)*n;
    }
}
