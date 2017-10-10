/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Win 8.1 VS8 X64
 */
public class CircleCollection {

    // Khởi tạo mảng list//
    private ArrayList<Circle> list = new ArrayList<Circle>();
//-- Them 1 hinh tron vào mảng list//

    public void addCircle(Circle c) {
        list.add(c);
    }

//Lấy số lượng hình tròn trong mảng list//
    public void getSize() {
        int soLuonght = list.size();
    }

    //Lấy hình tròn tại vị trí xd trong mảng list
    public int getCircle(Circle c) {
        return list.indexOf(c);
    }

    //Gán hình tròn tại vị trí xd trong mảng list
    public void setCircle(Circle c,int i) {
        list.set(i, c);
    }

    //Trả về thông tin của tập các hình tròn trong mảng list
    public String toString() {
        return list.toString();
    }

    // Hàm tính tổng diện tích hình trỏn
    public double tongS() {
        double tong = 0;
        for (Circle c : this.list) {
            tong = tong + c.getArea();
        }
        return tong;
    }

    // Hàm tìm diện tích lớn nhất
    public double maxS() {
        double max = this.list.get(0).getArea();
        for (Circle c : this.list) {
            if (max < c.getArea()) {
                max = c.getArea();
            }
        }
        return max;
    }
    
    
    // Hàm lấy hình tròn có diện tích nhỏ nhất
    
    public void hinhTron_min(){
    double min= this.list.get(0).getArea();
    
    for(Circle c:this.list){
    if(c.getArea()<min){
    min=c.getArea();
    
    }
    }
    
        System.out.println("Hình tròn co diện tích nhỏ nhất là ");
    }
}
