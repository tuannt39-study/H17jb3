/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP2;

/**
 *
 * @author viet
 */
public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist1 = new Artist(new Rectange(4,4));
        artist1.drawShape();
        System.out.println("");
        Artist artist2 = new Artist(new RightTriangle(4));
        artist2.drawShape();
    }
}
