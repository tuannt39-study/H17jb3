/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int counter,n;
        long last=1,next=0,sum;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao 1 so: ");
        n= sc.nextInt();
        while(next<(n/2))
        {
            System.out.println(" "+last);
            sum=next+last;
            next=last;
            last=sum; 
    }
    }   
}
