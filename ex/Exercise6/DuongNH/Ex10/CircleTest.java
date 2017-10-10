/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex10;

/**
 *
 * @author Win7
 */
import java.util.*;
public class CircleTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x;
        int y;
        int radius;
        
        System.out.println("Nhap n = ");
        int n = sc.nextInt();sc.nextLine();
        Circle arrayOfCircle[] = new Circle[n];
        
        for(int i=0;i<n;i++){
            System.out.print("Nhap toa do va ban kinh hinh tron([x, y],R): ");
            x = sc.nextInt();sc.nextLine();
            y = sc.nextInt();sc.nextLine(); 
            radius = sc.nextInt();sc.nextLine(); 
            Circle circle = new Circle(x,y,radius);
            arrayOfCircle[i] = circle;
        }
        for(int i=0;i<arrayOfCircle.length;i++){
            System.out.println("Hinh tron thu "+i);
            System.out.println("Duong kinh = "+arrayOfCircle[i].getDiameter());
            System.out.println("Chu vi = "+arrayOfCircle[i].getCircumference());
            System.out.println("Dien tich = "+ arrayOfCircle[i].getArea());
        }
    }
}
