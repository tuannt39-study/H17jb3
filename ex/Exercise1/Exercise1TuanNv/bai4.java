/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg1.pkg1;

/**
 *
 * @author TUAN
 */
import java.util.Scanner;
import java.math.MathContext;// khai bao thu vien toan hoc
public class bai4 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        float a=0, b=0, c=0, delta=0;
        System.out.println("nhap a= ");
        a=scanner.nextFloat();
        System.out.println("nhap b= ");
        b=scanner.nextFloat();
        System.out.println("nhap c= ");
        c=scanner.nextFloat();
        delta= b*b-4*a*c;
        if(a==0)
            System.out.println("day la phuong trinh bac nhat co nghiem la: x= "+(-c/b));
        else{
            if(delta<0)
                System.out.println("phuong trinh vo nghiem");
            else if(delta==0)
                System.out.println("phuong trinh co nghiem kep la: x= "+(-b/(2*a)));
            else{
                System.out.println("phuong trinh co 2 nghiem phan biet la: ");
                System.out.println("x1= "+((-b+Math.sqrt(delta))/(2*a)));
                System.out.println("x2= "+((-b-Math.sqrt(delta))/(2*a)));
            }
        }
    }
}
