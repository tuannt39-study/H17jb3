package Excercise_3;

/**
 * Created by minht on 4/23/2017.
 */
public class Ex1 {
    private static String[] splitByRange(String sample,int range){
        return (range<1 || sample==null) ? null : sample.split("(?<=\\G.{"+range+"})");
    }
    public static void main(String[] args) {
    }
    private static int CountInSentence(String sample, String Key){
        String[] extractSample = sample.split("");
        String[] extractKey = Key.split("");
        int i=0;
        for (String a:extractSample) {
            if (extractKey[0]==a){
                i++;
            }
        }
        return i;
    }

}
