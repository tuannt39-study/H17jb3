/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import vn.hackademic.collection.Student;
import vn.hackademic.collection.Std;

/**
 *
 * @author haopv
 */
public class StudenTreeSet {
    public static void main(String[] args) {
        Student s1 = new Student("A0001", "Nguyen van A 1");
        Student s2 = new Student("A0002", "Nguyen van A 1");
        Student s3 = new Student("A0003", "Nguyen van A 3");
        
        Std st1 = new Std("A0002", "Nguyen van A 1");
        
        //st1 = (Std)s2; 
        TreeSet hs = new TreeSet();
        //HashSet hs = new HashSet();
        
        hs.add(s1);
        hs.add(s2);
        hs.add(st1);
        hs.add(s3);
        
        //hs.add(s3);
        //hs.add(s2);
        //hs.add(new Student("A0005", "TEm moi"));
        
        /*
        Iterator it = hs.iterator();
        int i =0;
        while(it.hasNext()){
            System.out.println("pt: "+it.next());
            if (i >2) break;
            i++;
        }
        */
        System.out.println(hs);
        Iterator it2= hs.descendingIterator();
        System.out.println(it2.next());
        
        for(Object obj: hs){
            System.out.println("obj: "+obj);
        }
    }
    
}
