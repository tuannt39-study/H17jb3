package Excersice_5.ex12;

import Excersice_5.ex10.Point;

/**
 * Created by minht on 5/10/2017.
 */
public class RightTrianle extends Shape{
    public RightTrianle(int height) {
        this.height = height;
    }

    public RightTrianle() {
    }

    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void draw(){
        for (int i=0;i<this.height;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class mainforTriangle{
    public static void main(String[] args) {
        RightTrianle rightTrianle = new RightTrianle();
        rightTrianle.setHeight(4);
        rightTrianle.draw();
    }
}
