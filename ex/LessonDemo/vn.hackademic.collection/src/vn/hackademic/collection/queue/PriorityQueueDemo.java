/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.collection.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import vn.hackademic.collection.Student;

/**
 *
 * @author haopv
 */
public class PriorityQueueDemo {
    
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue();
        
        pq.add(new Student("A0003", "Nguyen van A 3"));
        pq.add(new Student("A0001", "Nguyen van A 1"));
        
        
        pq.add(new Student("A0005", "Nguyen van A 0"));
        System.out.println(pq.poll());
        pq.add(new Student("A0002", "Nguyen van A 2"));
        pq.add(new Student("A0004", "Nguyen van A 4"));
        System.out.println(pq.poll());
        pq.add(new Student("0000", "Nguyen van F"));
        
        
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
    
}
