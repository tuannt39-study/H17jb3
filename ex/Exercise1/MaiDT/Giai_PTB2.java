/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giai_ptb2;
import java.lang.Math.*;
import java.util.Scanner;
/**
 *
 * @author Win 8.1 VS8 X64
 */
public class Giai_PTB2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,c, delta;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào hệ số a:");
        a= input.nextDouble();
        System.out.println("Nhập vào hệ số b:");
        b= input.nextDouble();
        System.out.println("Nhập vào hệ số c:");
        c= input.nextDouble();
        delta = b*b-4*a*c;
            if(a==0)
            {
                if(b==0)
                {
                    if(c==0)
                        System.out.println("Phương trình có vô số nghiệm!");
                    else
                        System.out.println("Phương trình vô nghiệm!");
                }
                else
                    System.out.println("Phương trình có 1 nghiệm x= "+(-c/b));
            }
            else
            {
                if(delta==0)
                    System.out.println("Phương trình có nghiệm kép x1=x2 = "+(-b/(2*a)));
                else if(delta < 0)
                    System.out.println("Phương trình vô nghiệm!");
                else 
                {
                    System.out.println("Phương trình có 2 nghiệm phân biệt:");
                    System.out.println("x1="+((-b+Math.sqrt(delta))/(2*a)));
                    System.out.println("x2="+((-b-Math.sqrt(delta))/(2*a)));
                }    
            
            }
        
    }
    
    
}
