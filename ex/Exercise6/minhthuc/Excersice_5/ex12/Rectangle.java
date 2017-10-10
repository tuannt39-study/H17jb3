package Excersice_5.ex12;

/**
 * Created by minht on 5/10/2017.
 */
public class Rectangle extends Shape {
    private int chieudai,chieurong;

    public int getChieudai() {
        return chieudai;
    }

    public Rectangle() {
    }

    public Rectangle(int chieudai, int chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public void setChieudai(int chieudai) {
        if (chieudai<1||chieudai>15){
            System.err.println("Chieu dai phai nam trong khoang [1,15]");

        }else this.chieudai = chieudai;

    }

    public int getChieurong() {
        return chieurong;
    }

    public void setChieurong(int chieurong) {
        if (chieurong<1||chieurong>15){
            System.err.println("Chieu dai phai nam trong khoang [1,15]");

        }else this.chieurong = chieurong;
    }
    public void draw(){
        for (int i=0;i<this.chieudai;i++){
            System.out.print("*");
        }
        System.out.println();
        for (int j=0;j<(this.chieurong-2);j++){
            System.out.print("*");
            for (int i=0;i<this.chieudai-2;i++){
                System.out.print(" ");
         }
            System.out.println("*");
        }


        for (int i=0;i<this.chieudai;i++){
            System.out.print("*");
        }
    }
}
class mainRec{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setChieudai(7);
        r.setChieurong(3);
        r.draw();
    }
}