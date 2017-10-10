package Excersice_1;

/**
 * Created by minht on 4/17/2017.
 */
public class ex5 {
    public static void main(String[] args) {
       int a = deQuy(5);
       int a1 = traitional(5);
        System.out.println(a);
        System.out.println(a1);
    }
    private static int traitional(int n){
        int S=0;
        for(int i =1;i<=n;i++){
            S+=i;
        }
        return S;
    }
    private static int deQuy(int n){
        if (n==1){
            return 1;
        }else return (deQuy(n-1)+n);
    }
}
