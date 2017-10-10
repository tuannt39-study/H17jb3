/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author viet
 */
public class Bai9 {
    public static void main(String args[])
    {
        int fn = 0 ,fn1,fn2,n,i;
        fn1 = 1;
        fn2 = 1;
        Scanner inp = new Scanner(System.in);
        System.out.println("Nhap so nguyen N lon hon 2 : ");
        n = inp.nextInt();
        for ( i = 2 ; i <= n ; i++)
        {
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
        }
        System.out.println("Fn = "+fn);
    }
}
