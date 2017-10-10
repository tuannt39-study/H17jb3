package part7OOP;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LilyEvans
 */
public class CircleCollection {

    private static ArrayList<Circle> circleCollection = new ArrayList<Circle>();
    private static CircleCollection collection = new CircleCollection();

    public static CircleCollection getCollection() {
        if (collection == null) {
            return new CircleCollection();
        } else {
            return collection;
        }
    }

    public void addCircle(Circle a) {
        this.circleCollection.add(a);
    }

    public ArrayList<Circle> getCircleCollection() {
        return circleCollection;
    }

    public void addCircle() {
        Circle a = new Circle((int) (Math.random() * 20));
        addCircle(a);
    }

    public static void main(String[] args) {
        double max = 0, min = 0;
        int maxC = 0, minC = 0;
        CircleCollection collection = new CircleCollection();
        for (int i = 0; i < 10; i++) {
            collection.addCircle();
            if (collection.getCircleCollection().get(i).getArea() < min) {
                min = collection.getCircleCollection().get(i).getArea();
                minC = i;
            }
            if (collection.getCircleCollection().get(i).getArea() > max) {
                max = collection.getCircleCollection().get(i).getArea();
                maxC = i;
            }
        }
        System.out.println("Max: " + collection.getCircleCollection().get(maxC).toString());
        System.out.println("Min " + collection.getCircleCollection().get(minC).toString());

    }
}
