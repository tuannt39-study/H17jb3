/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author VIET - HP8570W
 */
public class Bai6 {

    public static void main(String[] args) {
        int m = 0 , n  = 0;
        boolean check;
        do {
            try {
                check = true;
                Scanner in = new Scanner(System.in);
                System.out.print("Nhap m : ");
                m = in.nextInt();
                System.out.print("Nhap n : ");
                n = in.nextInt();
            } catch (InputMismatchException e1) {
                System.out.println("Nhap sai kieu ");
                
                check = false;
            }
        } while (!check);
        
        int[][] arrayInt = new int[m][n];
        //
        Scanner in = new Scanner(System.in);
        try {
            for ( int i = 0 ; i < m ; i++)
            for ( int j = 0 ; j < n ; j++ ){
                System.out.print("arrayInt["+i+","+j+"] = ");
                arrayInt[i][j] = in.nextInt();
            }
        } catch (InputMismatchException e1) {
            System.out.println("Nhap sai kieu !");
        } catch (Exception e2){
            System.out.println("Eo biet loi gi ");
        }
        
        
    }
}
