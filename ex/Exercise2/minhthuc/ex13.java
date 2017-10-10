package Exercise_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by minht on 4/20/2017.
 */
public class ex13 {
    public static void main(String[] args) {
        int [][] ar = ArrayCreate(5,5);
        System.out.println(ToString(ar));
//        System.out.println(min(ar));
//        System.out.println(minOdd(ar));
        System.out.println(ArrayMaxSum(ar));
    }
    private static int genrateRandomNumber(int from, int to){
        Random rm = new Random();
        int ram = from+rm.nextInt(to-from+1);
        return ram;
    }
    private static int[][] ArrayCreate(int col, int row){
        int[][] ar = new int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                int value = genrateRandomNumber(3 ,10);
                ar[i][j]= value;
            }
        }
        return ar;
    }
    private static String ToString(int[][] a){
        String rs ="";
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                rs +="  "+a[i][j];
            }
            rs+="\n";
        }
        return rs;
    }
    private static int min(int[][] a){
        int min =a[0][0];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                if (min>=a[i][j]){
                    min = a[i][j];
                }
            }
        }
        return min;
    }
    private static String minOdd(int[][] a){
        List<Integer> odd = new ArrayList<Integer>();
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                if (a[i][j]%2==1){
                    odd.add(a[i][j]);
                }
            }
        }
        int min =odd.get(0);
//        int[] tmpar = new int[odd.size()];
        for (int i=0;i<odd.size();i++){
//            tmpar[i]=odd.get(i);
            if (min>=odd.get(i)){
                min = odd.get(i);
            }
        }
        if (odd.size()==0){
            return "none";
        }else return String.valueOf(min);
//        return min;
    }
    private static String ArrayMaxSum(int[][] a){

        List<Integer> sum = new ArrayList<Integer>();
        for (int i=0;i<a.length;i++){
            int Sum =0;
            for (int j=0;j<a[0].length;j++){
                Sum+=a[i][j];
            }
            sum.add(Sum);
        }
        int max =sum.get(0);
        int pos= 0;
//        int[] tmpar = new int[odd.size()];
        for (int i=0;i<sum.size();i++){
//            tmpar[i]=odd.get(i);
            if (max<=sum.get(i)){
                max = sum.get(i);
                pos=i;
            }
        }
        String ar = "";
        for (int i=0;i<a[0].length;i++){
            ar += " "+a[pos][i];
        }
        return ar;
    }
}
