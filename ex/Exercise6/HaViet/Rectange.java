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

public class Rectange extends Shape {

    private int chieuDai;
    private int chieuRong;

    public Rectange() {
    }

    public Rectange(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        if (chieuDai < 1) {
            this.chieuDai = 1;
        } else if (chieuDai > 15) {
            this.chieuDai = 15;
        } else {
            this.chieuDai = chieuDai;
        }
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public void draw() {
        for (int i = 0; i < chieuRong; i++) {
            for (int j = 0; j < chieuDai; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
