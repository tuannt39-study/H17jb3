package Excersice_1;

/**
 * Created by minht on 4/17/2017.
 */
public class ex6 {
    public static void main(String[] args) {
        System.out.println(dequy(3));
//        float a = 1f+1f/2f+1f/3f+1f/4f;
//        System.out.println(a);
    }
    private static float traditional(int n){
        float rs = 0;
        for(int i=n;i>0;i--){
            rs+=1f/i;
        }
        return rs;
    }
    private static float dequy(int n){
        if (n==1){
            return 1;
        }else {
            return (dequy(n-1)+(1f/n));

        }
    }
}
