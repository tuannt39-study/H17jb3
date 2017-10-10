/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.collection.map;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author haopv
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap hs = new TreeMap();
        
        hs.put("while", "Mau trắng");
        hs.put("red", "Mau đỏ");
        hs.put("green", "Mau xanh la");
        hs.put("blue", "Mau xanh biển");
        hs.put("hồng", "Mau hồng");
        
        System.out.println(hs.descendingKeySet());
        System.out.println(hs);
        
        // nhạp them
        Scanner them = new Scanner(System.in);
        System.out.println("Nhập một màu: ");
        String word = them.nextLine();
        
        
        // qua 
        Object mean = hs.get(word);
        if(null!=mean){
            System.out.println("Có rồi: "+mean);
        }else{
            System.out.println("Chưa Có");
            hs.put(word, "moiwdlfj aisdj");
        }
        // Xử dụng cho cac bai toan tim kiem
        System.out.println(hs);
        
    }
}
