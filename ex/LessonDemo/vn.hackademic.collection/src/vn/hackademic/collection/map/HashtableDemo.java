/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.collection.map;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author haopv
 */
public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable hs = new Hashtable();
        
        hs.put("red", "Mau đỏ");
        hs.put("green", "Mau xanh la");
        hs.put("blue", "Mau xanh biển");
        hs.put("pink", "Mau hồng");
        hs.put("while", "Mau trắng");
        
        
        System.out.println(hs.get("blue"));
        
        System.out.println(hs);
        
        
        //nhạp them
        Scanner them = new Scanner(System.in);
        System.out.println("Nhập một màu: ");
        String word = them.nextLine();
        
        // lay toan bo key
        Set keys = hs.keySet();
        for (Object key: keys){
            // So sanh
            if(word.equalsIgnoreCase(key.toString())){
                // Nếu thay báo ra và hiện
                System.out.println("Có rồi: "+hs.get(key));
                break;
            }else{
                 System.out.println("Chưa Có!");
            }
        }
        
    }
}
