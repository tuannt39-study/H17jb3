/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.collection.list;

import java.util.LinkedList;

/**
 *
 * @author haopv
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList lkl = new LinkedList();
        
        lkl.addFirst(1);
        lkl.addFirst(2);
        lkl.add("3");
        lkl.addLast("Lasst");
        
        lkl.push("Chao"); // luon vao phan tu dau
        //lkl.clear();
        Object o = lkl.pollLast();
        Object o2 = lkl.get(2);
        System.out.println("O: "+o.toString());
        System.out.println("Vi tri cua 3: "+lkl.indexOf(o2));
        
        
        
        
        // 2,1,3,Last, Chao
        // for ec hoac itator ko nen dung get(i)
        for (Object obj: lkl){
            System.out.println("pt: "+obj);
        }
        
    }
    
}
