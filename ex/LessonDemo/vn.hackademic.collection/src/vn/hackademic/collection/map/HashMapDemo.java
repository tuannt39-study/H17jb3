/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.collection.map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author haopv
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hs = new HashMap();
        
        hs.put("red", "Mau đỏ");
        hs.put("green", "Mau xanh la");
        hs.put("blue", "Mau xanh biển");
        hs.put("pink", "Mau hồng");
        hs.put("while", "Mau trắng");
        
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
            System.out.println("ko");
        }
        /*
        // lay toan bo key
        Set keys = hs.keySet();
        for (Object key: keys){
            // So sanh
            if(word.equalsIgnoreCase(key.toString())){
                // Nếu thay báo ra và hiện
                System.out.println("Có rồi: "+hs.get(key));
            }else{
                 System.out.println("Chưa Có!");
            }
        }
        */
    }
}
