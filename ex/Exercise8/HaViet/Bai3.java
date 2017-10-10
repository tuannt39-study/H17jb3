/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.sql.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author viet
 */
public class Bai3 {

    public static void main(String[] args) {
        ObjectOutputStream oos= null;
        long now = System.currentTimeMillis();
        Date date = new Date(now);        
        try {         
             oos = new ObjectOutputStream(new FileOutputStream("bai3.dat"));
            Random rd = new Random();
            for ( int i = 0 ; i < 5 ; i++)               
                oos.write(rd.nextInt());
            oos.writeObject(date);
            oos.writeDouble(5.5);
            
            
                                   
        } catch (IOException ex) {
            Logger.getLogger(Bai3.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Bai3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
