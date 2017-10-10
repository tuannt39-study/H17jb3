package Excercise_3;

/**
 * Created by minht on 4/25/2017.
 */
public class Ex9 {
    private static String RevertString(String str){
        String[] tmp = str.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=tmp.length-1;i>=0;i--){
            stringBuilder.append(tmp[i]);

        }
        return stringBuilder.toString();
    }
}
