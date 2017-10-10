package Exercise_2;

/**
 * Created by minht on 4/17/2017.
 */
public class ex10 {
    public static void main(String[] args) {
        System.out.println(SumOfElement(8545604 ));
    }
    private static int SumOfElement(int num){
        String stringNum = String.valueOf(num);
        String[] strArray = stringNum.split("");
        int sum =0;
        for (String a:strArray) {
            sum+=Integer.parseInt(a);
        }
        return sum;
    }
}
