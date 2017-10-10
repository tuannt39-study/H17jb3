package Excersice_5.ex12;

/**
 * Created by minht on 5/10/2017.
 */
public class Artist {
    public Shape shape;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Artist(Shape shape) {
        this.shape = shape;
    }
    public void drawShape(){
        shape.draw();
    }
}
