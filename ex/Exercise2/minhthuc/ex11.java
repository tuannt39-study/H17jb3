package Exercise_2;

/**
 * Created by minht on 4/17/2017.
 */
public class ex11 {
    public static void main(String[] args) {

    }
    private static boolean Nguyento(int num){
        boolean rs = true;
        for (int i=2;i<num;i++){
            if (num%i==0){
                rs=false;
            }
        }
        return rs;
    }
}
