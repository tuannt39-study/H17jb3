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
public class Student extends Address {
    private String firstName;
    private String lastName;
    private Address homeAddress;
    private Address schoolAddress;
    
    Student(){}
    Student(String fn, String ln, Address hA, Address sA){
        this.firstName = fn;
        this.lastName = ln;
        this.homeAddress = hA;
        this.schoolAddress = sA;
    }
    
    public void In(Scanner sc){
        System.out.println("Nhap thong tin sinh vien:");
        System.out.print("First name: ");
        firstName = sc.nextLine();
        System.out.print("Last name: ");
        lastName = sc.nextLine();
        System.out.print("Home address: ");
        homeAddress.In(" Home ");
        System.out.print("Shool address: ");
        schoolAddress.In(" School ");
    }
    @Override
    public String toString(){
        return ("First name: "+firstName+"\nLast name: "+lastName+"\nHome address: "+homeAddress+"\nSchool address: "+schoolAddress);
    }
}
