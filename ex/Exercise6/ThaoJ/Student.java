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
public class Student {
    String firstName;
    String lastName;
    String homeAddress;
    String schoolAddress;

    public void inputStudent(){
        Scanner nst = new Scanner(System.in);
        System.out.println("Nhap ten : ");
        this.firstName = nst.nextLine();
        System.out.println("Nhap ho: ");
        this.lastName = nst.nextLine();
        System.out.println("Nhap dia chi nha: ");
        this.homeAddress = nst.nextLine();
        System.out.println("Nhap dia chi truong hoc: ");
        this.schoolAddress = nst.nextLine();
    }
    
    @Override
    public String toString() {
        return "Ten : " + firstName + ",\n Ho : " + lastName + ",\n Dia chi nha : " + homeAddress + ",\n Dia chi truong hoc : " + schoolAddress + '}';
    }

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

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }
}

