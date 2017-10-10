/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student {

    public Student() {
    }
    private String fistname;
    private String lastname;
    private String homeAddress;
    private String schoolAddress;
    private int soluongsinhvien;
    private ArrayList<Student> dssv=new ArrayList<Student>();

    public Student(String Ho, String Ten, String Nha, String Truong) {
        this.fistname=Ho;
        this.lastname=Ten;
        this.homeAddress=Nha;
        this.schoolAddress=Truong;
        
    }


    /**
     * @return the fistname
     */
    public String getFistname() {
        return fistname;
    }

    /**
     * @param fistname the fistname to set
     */
    public void setFistname(String fistname) {
        this.fistname = fistname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the homeAddress
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * @param homeAddress the homeAddress to set
     */
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    /**
     * @return the schoolAddress
     */
    public String getSchoolAddress() {
        return schoolAddress;
    }

    /**
     * @param schoolAddress the schoolAddress to set
     */
    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }
   
    public void add(Student sv){
       this.soluongsinhvien = this.soluongsinhvien + 1;
    }
   
    public String toString(){
        return "Ho: " +this.fistname+" Ten: "+this.lastname+" Dia chi nha:"+this.homeAddress+"Dia Chi Truong: "+this.schoolAddress;
    }
    /**
     * @return the dssv
     */
    public ArrayList<Student> getDssv() {
        return dssv;
    }

    /**
     * @param dssv the dssv to set
     */
    public void setDssv(ArrayList<Student> dssv) {
        this.dssv = dssv;
    }
}

    
