/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex7;

/**
 *
 * @author Win7
 */
import java.util.Scanner;
public class StudentBody {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        
        System.out.println("Thong tin sinh vien 1: ");
        st1.In(sc);
        System.out.println("Thong tin sinh vien 2: ");
        st2.In(sc);
        System.out.println("Thong tin sinh vien 3: ");
        st3.In(sc);
        
        st1.toString();
        st2.toString();
        st3.toString();
    }
}
