/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.collection.set;

import java.util.HashSet;
import vn.hackademic.collection.Student;

/**
 *
 * @author haopv
 */
public class StudenHashSet {
    public static void main(String[] args) {
        Student s1 = new Student("A0001", "Nguyen van A 1");
        Student s2 = new Student("A0002", "Nguyen van A 2");
        Student s3 = new Student("A0003", "Nguyen van A 3");
        
        HashSet hs = new HashSet();
        
        hs.add(s1);
        hs.add(s2);
        //hs.add(s2);
        hs.add(s3);
        hs.add(new Student("B001", "TEm moi"));
        
        
        for(Object obj: hs){
            System.out.println("obj: "+obj);
        }
    }
}
