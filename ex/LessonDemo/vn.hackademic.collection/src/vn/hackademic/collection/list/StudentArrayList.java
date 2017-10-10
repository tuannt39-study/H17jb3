/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.collection.list;

import java.util.ArrayList;
import java.util.PriorityQueue;
import vn.hackademic.collection.Student;

/**
 *
 * @author haopv
 */
public class StudentArrayList {
    public static void main(String[] args) {
        Student s1 = new Student("A0001", "Nguyen van A 1");
        Student s2 = new Student("A0002", "Nguyen van A 2");
        Student s3 = new Student("A0003", "Nguyen van A 3");
        
        ArrayList list = new ArrayList();
        
        list.add(s1);
        list.add(s2);
        list.add(s2);
        list.add(s3);
        
        
        for(Object obj: list){
            System.out.println("obj: "+obj);
        }
    }
}
