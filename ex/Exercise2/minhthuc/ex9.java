package Exercise_2;

import java.util.ArrayList;

/**
 * Created by minht on 4/17/2017.
 */
public class ex9 {
    public static void main(String[] args) {
        int[] a = Fibonacci(20);
        System.out.println(findInFibonacci(a,8));
        System.out.println(toString(a));
    }
    private static int[] Fibonacci(int n){
        int[] ar = new int[n];
        for (int i=0;i<n;i++){
            if (i<=1){
                ar[i]=1;
            }else {
                ar[i]=ar[i-2]+ar[i-1];
            }
        }
        return ar;
    }
    private static String toString(int[] a){
        String str = "";

        for (int b:a
             ) {
            str+=b+" ";
        }
        return str;
    }
    private static int findInFibonacci(int[] ar, int index){
        return ar[index-1];
    }
}
