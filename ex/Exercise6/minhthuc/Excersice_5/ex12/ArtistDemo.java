package Excersice_5.ex12;

/**
 * Created by minht on 5/10/2017.
 */
public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist(new Rectangle(8,4));
        artist.drawShape();
        System.out.println();
        System.out.println();
        Artist artist2 = new Artist(new RightTrianle(20));
        artist2.drawShape();
    }
}
