package Excersice_5;

/**
 * Created by minht on 5/4/2017.
 */
public class hinhtron {
    private float radius;
    private final float PI = 3.14f;
    public float chuvi(){
        return this.PI*this.radius*2;
    }
    public float dientich(){
        return this.PI*this.radius*this.radius;
    }

    public hinhtron() {
    }

    public hinhtron(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }


}
