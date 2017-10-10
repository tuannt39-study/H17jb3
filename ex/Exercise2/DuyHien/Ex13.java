
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Ex13 {
    static int n,m,matrix [][];
    public static void nhapMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        n = input.nextInt();
        System.out.println("Enter the number of column: ");
        m = input.nextInt();
        matrix = new int[n][m];
        for(int i = 0; i < n ; i++){
            for(int j =0; j < m ; j++){
            System.out.print("  a["+i+","+j+"]=");
            matrix[i][j]=input.nextInt();
            }
            System.out.println();
        }
    }
        public static void printMatrix(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            System.out.print(matrix[i][j] +"  ");
        }
        System.out.println("");
        }
    }
        public static int minMatrix(){
        int min=matrix[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j]<min) {
                    min=matrix[i][j];
                }
            }
        }
        return min;
    }
        public static int maxOdd(){
        int maxOdd=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((matrix[i][j]>maxOdd)&&(matrix[i][j]%2==1)) {
                maxOdd = matrix[i][j];
                }
            }
        }
        return maxOdd;
    }
    public static int totalRows(int row){
        int tong=0;
        for (int i = 0; i < m; i++) {
            tong+=matrix[row][i];
        }
        return tong;
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
        int max = totalRows(0) , chiso=0;
        nhapMatrix();
        printMatrix();
        System.out.println("The min element is " +minMatrix());
        System.out.println("The max element is: " + maxOdd());
        for (int i = 0; i < n; i++) {
            if (max< totalRows(i)) {
            max = totalRows(i);
            chiso = i;
            }
        }
        System.out.println("The row has the largest total is row " +chiso+ " has the value:" +max);
    }
}