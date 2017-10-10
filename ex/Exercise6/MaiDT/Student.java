/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_2;

import java.util.Scanner;

/**
 *
 * @author Win 8.1 VS8 X64
 */
public class Student {

    private String firstName;
    private String lastName;
    //  private Address homeaAddress,schoolAddress;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Student(String _firstName, String _lastName) {

        this.firstName = _firstName;
        this.lastName = _lastName;

    }

    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào FirstName:");
        this.firstName = input.nextLine();
        System.out.print("Nhập vào LastName:");
        this.lastName = input.nextLine();
    }

    public String toString(){
    return "FirstName:"+this.firstName+"\t|LastName:"+this.lastName+"\n";
    }
}
