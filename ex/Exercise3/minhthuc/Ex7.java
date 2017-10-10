package Excercise_3;

/**
 * Created by minht on 4/25/2017.
 */
public class Ex7 {
    private static String TrimExtraSpace(String str){
        String tmp = str.trim();
        return tmp.replaceAll("  "," ");
    }
}
