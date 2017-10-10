/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.collection.list;

import java.util.Vector;
import java.util.Iterator;

/**
 *
 * @author haopv
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector vec = new Vector();
        vec.add(1);
        vec.add(6);
        vec.add("Chao");
        vec.add(13.8);
        vec.add("ban");
        
        
        System.out.println("----- Lay theo vi tri");
        for (int i = 0; i < vec.size(); i++) {
            System.out.println("pt: "+vec.get(i));
        }
        
        System.out.println("----- Lay theo Iterator");
        Iterator it = vec.iterator();
        while(it.hasNext()){
            System.out.println("pt: "+it.next());
        }
        
        Vector vec2 = new Vector();
        vec2 = (Vector)vec.clone();
        vec2.add("Them");
        
        if(vec2.containsAll(vec)) System.out.println("La vec con");
        
        if(vec.contains("Chao")) System.out.println("có CHao");
        System.out.println("----- Lay theo for each");
        for (Object obj: vec2){
            System.out.println("pt-: "+obj);
        }
        
    }
    
}
