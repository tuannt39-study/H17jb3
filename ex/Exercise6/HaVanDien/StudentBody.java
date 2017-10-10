/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.ArrayList;
import java.lang.String;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class StudentBody {
    public static void main(String[] args) {
    ArrayList<Student> sinhvien = new ArrayList<>();
    String Ho,Ten,Nha,Truong,next="ok";    
       while(next.equals("ok")){
        System.out.println("Nhap Ho: ");
        Scanner sc= new Scanner(System.in);
        Ho = sc.nextLine();
        System.out.println("Nhap Ten: ");
        Ten=sc.nextLine();
        System.out.println("Nhap Dia chi nha: ");
        Nha=sc.nextLine();
        System.out.println("Nhap Dia chi Truong: ");
        Truong=sc.nextLine();
           System.out.println("Nhap ok de tiep tuc");
           next=sc.nextLine();
       sinhvien.add(new Student(Ho, Ten, Nha, Truong));
    }
       for(int i=0;i<sinhvien.size();i++)
            System.out.println(sinhvien.get(i).toString());
    }
    
}
