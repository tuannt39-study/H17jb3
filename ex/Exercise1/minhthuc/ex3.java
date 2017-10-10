package Excersice_1;

/**
 * Created by minht on 4/17/2017.
 */
public class ex3 {
    /*
    * param a
    * param b
    * param c
    * giai phuong trinh bac nhat
    * ax+b=0
    * */
    public static void main(String[] args) {
//        System.out.println(8/0);
    }
    private static float Slove (int a, int b){
//        float result=0;
        if (a==0){
            throw new ArithmeticException("can not /0");
        }else return b/a;
    }
}
