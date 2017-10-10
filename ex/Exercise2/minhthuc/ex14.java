package Exercise_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by minht on 4/20/2017.
 */
public class ex14 {
    public static void main(String[] args) {
        int[][] a = ArrayCreate(5,5);
        System.out.println(ToString(a));
        System.out.println(maxInRow(a));
//        System.out.println(ToString(NotPrimeToZero(a)));
        System.out.println(ToString(ColumSort(a)));



    }
    private static int genrateRandomNumber(int from, int to) {
        Random rm = new Random();
        int ram = from + rm.nextInt(to - from + 1);
        return ram;
    }

    private static int[][] ArrayCreate(int col, int row) {
        int[][] ar = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int value = genrateRandomNumber(1, 100);
                ar[i][j] = value;
            }
        }
        return ar;
    }

    private static String ToString(int[][] a) {
        String rs = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                rs += "  " + a[i][j];
            }
            rs += "\n";
        }
        return rs;
    }

    private static boolean isPrime(int a) {
        boolean rs = true;
        if (a <= 1) {
            rs = true;
        } else
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    rs = false;
                    break;
                }
            }
        return rs;
    }
    public static int[] sort(int[] a){
        int leng = a.length;
        for (int i = 0;i<leng;i++){
            for (int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    int tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                }
            }
        }
        return a;
    }

    private static String maxInRow(int[][] a) {
        List<Integer> listMax = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int max = a[i][0];
            for (int j = 0; j < a[0].length; j++) {
                if (max <= a[i][j]) {
                    max = a[i][j];
                }
            }
            listMax.add(max);
        }
        String rs = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                rs+=" "+a[i][j];
            }
            rs+="-----max->"+listMax.get(i)+"\n";
        }
        return rs;
    }

    private static int[][] NotPrimeToZero(int[][] b){
        int[][] a=b;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                if (!isPrime(a[i][j])){
                    a[i][j]=0;
                }
            }
        }
        return a;
    }

    private static int[][] nineTyDegree(int[][] b){
        int[][] a = new int[b[0].length][b.length];
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[0].length;j++){
                a[j][i] = b[i][j];
            }
        }
        return a;
    }
    private static int[][] sortArray2Dimension(int[][] a){
        for (int i=0;i<a.length;i++){
            sort(a[i]);
        }
        return a;
    }
    private static int[][] ColumSort(int[][] a){
        int[][] b = nineTyDegree(a);
        sortArray2Dimension(b);
        a = nineTyDegree(b);
        return a;
    }
}
