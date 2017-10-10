package Excersice_5.ex10;

/**
 * Created by minht on 5/10/2017.
 */
public class Point {
    private int x,y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public String toString(){
        return "["+this.x+","+this.y+"]";
    }
}
