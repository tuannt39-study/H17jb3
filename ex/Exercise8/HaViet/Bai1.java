/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author viet
 */
public class Bai1 {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        Random rd = new Random();
        try {
            fos = new FileOutputStream("bai1.dat", false);            
            for (int i = 0; i < 100 ; i++) {
                fos.write(rd.nextInt());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
