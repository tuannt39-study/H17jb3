/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

import java.util.Scanner;

/**
 *
 * @author ThaoJ
 */
public class StudentBody extends Student{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st = new Student();
        st.inputStudent();
        System.out.println("Thong tin sinh vien: " + st.toString());
    }
    
}
