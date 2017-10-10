package Excersice_5.ex_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by minht on 5/10/2017.
 */
public class CircleCollection {
    private ArrayList<Circle> circleArrayList = new ArrayList<>();
    public void addCircle(Circle circle){
        this.circleArrayList.add(circle);
    }
    public int getsize(){
        return this.circleArrayList.size();
    }

    public Circle getCircleArrayList(int position) {
        return this.circleArrayList.get(position-1);
    }

    public void setCircleArrayList(int position, Circle circle) {

        this.circleArrayList.set(position-1,circle);
    }
    public double getTotalArea(){
        double total =0;
        for (Circle c : this.circleArrayList){
            total+=c.getArea();
        }
        return total;
    }
    public String toString(){
        String tmp="";
        int i=1;
        for (Circle c:circleArrayList){
            tmp+="the circle "+i+" "+c.toString()+"\n";
            i++;
        }
        return tmp;
    }
    public double min(){
        double[] area = new double[this.getsize()];
        int i=0;
        for (Circle c: this.circleArrayList){
            area[i] = c.getArea();
            i++;
        }
        Arrays.sort(area);
        return area[0];
    }
    public double max(){
        double[] area = new double[this.getsize()];
        int i=0;
        for (Circle c: this.circleArrayList){
            area[i] = c.getArea();
            i++;
        }
        Arrays.sort(area);
        return area[4];
    }
    public  int genrateRandomNumber(int from, int to) {
        Random rm = new Random();
        int ram = from + rm.nextInt(to - from + 1);
        return ram;
    }
}
class main4Circle{
    public static void main(String[] args) {
        CircleCollection circleCollection = new CircleCollection();
        for (int i=1;i<6;i++){
            Circle circle = new Circle(circleCollection.genrateRandomNumber(2,10));
            circleCollection.addCircle(circle);
        }
        System.out.println(circleCollection.toString());
        System.out.println(circleCollection.min());
        System.out.println(circleCollection.max());
        System.out.println(circleCollection.getTotalArea());
    }
}
