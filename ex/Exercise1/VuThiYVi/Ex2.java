/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E2;

/**
 *
 * @author Ruki-Vi
 */
class Action {

    public void UseFor() {
        System.out.println("Use For: ");
        for (int i = 0; i < 20; i += 2) {
            System.out.println(i);
        }
        System.out.println("=========");
    }
}

public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application log ic here4
        Action ac = new Action();
        ac.UseFor();
        Ex2 fw = new Ex2();
        fw.UseWhile();
    }

    public void UseWhile() {
        int x = 0;
        System.out.println("Use While: ");
        while (x < 20) {
            System.out.println(x);
            x += 2;
        }
    }
}
