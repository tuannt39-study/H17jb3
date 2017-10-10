/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ex14 {

   static int n,m,matrix [][];
    public static void nhapMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        n = input.nextInt();
        while(0 > n || 100 < n){
            System.err.println("Enter an integer > 0 and < 100: ");
            n = input.nextInt();
        }
        System.out.println("Enter the number of column: ");
        m = input.nextInt();
        while(0 > m || 100 < m){
            System.err.println("Enter an integer > 0 and < 100: ");
            m = input.nextInt();
        }
        matrix = new int[n][m];
        for(int i = 0; i < n ; i++){
            for(int j =0; j < m ; j++){
            System.out.print("  a["+i+","+j+"]=");
            matrix[i][j]=input.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            System.out.print(matrix[i][j] +"  ");
        }
        System.out.println("");
        }
    }
    
        public static void maxMatrix(){
            nhapMatrix();
        int max = matrix[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j]>max) {
                    max=matrix[i][j];
                }
            }
        }
            System.out.println("The max value is " +max);
    }
        public static void isPrime(){
            nhapMatrix();
            System.out.println("The prime numbers are: ");
            for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
            for(int m = 2; m < matrix[i][j]; m++){
                if(matrix[i][j] % m == 0){
                    matrix[i][j] = 0;
            }else{
                    System.out.print(matrix[i][j] );
                    System.out.print(" ");
                }
            }
            }
                
        }
        
        }
        public static void Sort(){
            nhapMatrix();
             for(int i = 0; i < n - 1; i++){
             for(int j = 0; j < m - 1; j++) {
                 for(int a = 1; a < n; a++){
                 for(int b = 1; j < m; b++) {
                     if(matrix [i][j] > matrix[a][b]){
                         int temp = matrix [i][j];
                         matrix[i][j] = matrix[a][b];
                         matrix[a][b] = temp;
                     }
                 }
             }
           }
        }
          
        }
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
           System.out.println("MENU !!!");
           System.out.println("1. Find the max value of matrix. ");
           System.out.println("2. Find the prime number. ");
           System.out.println("3. Order matrix asc ");
           System.out.println("4. Exit. ");
           System.out.println("Please enter a number to select : ");
            int select = sc.nextInt();
            if(1 > select || 5 < select){
                System.err.println("You entered incorrectly, please try again ! ");
                select = sc.nextInt();
            }
            switch(select){

                case 1:
                    maxMatrix();
                  break;
                case 2:
                   isPrime();
                    break;
                case 3:
                    Sort();
                    break;
                case 4:
                    System.exit(1);
                default:
                    break;
            }
        } 
    
    }

        
    