/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.collection.stack;

import java.util.Stack;

/**
 *
 * @author haopv
 */
public class StackDemo {
    public static void main(String[] args) {
        System.out.println("Start");
        Stack s = new Stack();
        s.push("Chao");
        s.push(1);
        System.out.println("out: "+s.pop().toString());
        s.push("3");
        s.push(10);
        
        
        while(!s.isEmpty()){
            System.out.println("out: "+s.pop().toString());
        }
    }
    
}
