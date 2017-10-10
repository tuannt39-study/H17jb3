package JavaExerciseP1;

/**
 * Created by MyPC on 17/04/2017.
 */
public class Ex2 {
    public static void main(String[] args){
        int [] input=number(1,20);
        int[]even=evennumber(input,21);
        int sum =sumall(even);
        String tmp = ArrayShow(even);
        System.out.println(sum);
    }

    private static int[] number(int min, int max) {
        int[]a=new int[(max-min+1)];
        for (int i=min;i<max;i++){
            a[i]=i;
        }
        return a;
    }

    private static int[] evennumber(int[] sample, int range) {
        int[]a=new int[range];
        int init = 0;
        for (int i=0;i<sample.length;i++){
            if (sample[i]%2==0){
                a[init]=sample[i];
                init++;
            }
        }
        return a;
    }
    private static int sumall(int[]a) {
        int sum = 0;
        for (int i=0;i<a.length;i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    private static String ArrayShow(int[] a) {
        String rs="";
        for (int i=0;i<a.length;i++){
            rs+=a[i]+" ";
        }
        return rs;
    }
        }

