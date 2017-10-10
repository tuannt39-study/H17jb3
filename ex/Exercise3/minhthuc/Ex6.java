package Excercise_3;

/**
 * Created by minht on 4/25/2017.
 */
public class Ex6 {
    public static void main(String[] args) {
        HighestFrequency("asd asd aswqqwe sad isa jsda l asdj asd");
    }
    private static char[] lowCase(){
        char[] low = new char[26];
        for (int i= 97;i<=122;i++){
            low[i-97] = (char)i;
        }
        return low;
    }
    private static char[]upperCase(){
        char[] up = new char[26];
        for (int i= 65;i<=90;i++){
            up[i-65] = (char)i;
        }
        return up;
    }
    private static void HighestFrequency(String sample){
        String[] tmp = sample.split("");
        char[] low = lowCase();
        int[] frequency = new int[26];
        for (int i =0;i<26;i++){
            for(int j=0;j<tmp.length;j++){
                if ((low[i]+"").equals(tmp[j])){
                    frequency[i]++;
                }
            }
        }
        int pos=0;
        int max =0;
        for (int i = 0;i<26;i++) {
            if (max<frequency[i]){
                max = frequency[i];
                pos = i+1;
            }
        }
        System.out.println((char)(pos+96)+"");
        System.out.println("The frequence is: "+max);
    }
}
