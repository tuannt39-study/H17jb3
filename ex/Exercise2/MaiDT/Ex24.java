/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ex24 {

    /**
     * @param args the command line arguments
     */
    static int n, m, matran[]   [];
static boolean nguyento(int v) {
        if ( abs(v) <= 3 ) {
            return true;
        }
        for (int i = 2; i <= sqrt(abs(v)); i++) {
            if (abs(v) % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int maxmatran() {
        int max = matran[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max< matran[i][j] ) {
                    max = matran[i][j];
                }
            }
        }
        return max;
    }
    public static void nhapmatran() {
        Scanner input = new Scanner(System.in);
        System.out.println ("Nhập vào số hàng:");
        n = input.nextInt() ;
        System.out.println("Nhập vào số cột:");
        m = input.nextInt();
        matran= new int[n][m];
        for(int i=0; i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.println("a["+i+","+j+"] = ");
                int temp= input.nextInt();
                if(temp>= 0 && temp<=100 )
                {
                    matran[i][j]=temp;
                }
                else{
                    System.out.println("Phần tử nhập vào không phải là số nguyên,hãy nhập lại");
                    j--;
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        nhapmatran();
        System.out.println("Phần tử lớn nhất của ma trận là:"+maxmatran());
    }

}
