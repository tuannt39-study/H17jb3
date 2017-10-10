/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex13;

/**
 *
 * @author Win7
 */
public class TestGeometricObject {
    public static void main(String[] args){
        Circle2 HT = new Circle2(3.0);
        Rectangle2 RA = new Rectangle2(3, 5);
        
        System.out.println("Dien tich hinh tron = "+HT.getArea());
        System.out.println("Dien tich hinh chu nhat = "+RA.getArea());
        
        if(HT.getArea()>RA.getArea()){
            System.out.println("Hinh tron co dien tich lon hon");
        }else
            System.out.println("Hinh chu nhat co dien tich lon hon");
        
    }
}
