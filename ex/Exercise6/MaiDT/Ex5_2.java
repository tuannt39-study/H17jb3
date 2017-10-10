/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_2;

import java.util.ArrayList;


/**
 *
 * @author Win 8.1 VS8 X64
 */
public class Ex5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /*   Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();*/
       /* ArrayList<Student> list = new ArrayList<Student>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        for (int i = 0; i < list.size(); i++) {
            //System.out.println("FirstName:"+list.get(i).getFirstName()+"\t|LastName:"+list.get(i).getLastName());
            ;
        }
        //  System.out.println(list.toString());*/
       /*Circle c1= new Circle(50);
       Circle c2= new Circle();
       CircleCollection cc2= new CircleCollection();
       cc2.addCircle(c1);
       cc2.addCircle(c2);
        System.out.println(cc2.toString());
        System.out.println("Tổng diện tích của các hình tròn là:"+cc2.tongS());
        System.out.println("Diện tích lớn nhất là:"+cc2.maxS());
 */
       
       Shape sp = new Shape();
//       Rectangle rg= new Rectangle(7, 3);
//       rg.draw();
       RightTriangle rt=new RightTriangle(4);
       rt.draw2();
       
    }

}
