/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author viet
 */
public class Bai2 {

    public static void main(String[] args) {
        BufferedReader fin = null;
        BufferedWriter fos = null;
        try {
            fin = new BufferedReader(new FileReader("file1.dat"));
            fos = new BufferedWriter(new FileWriter("file2.dat", false));
            while (true) {
                String str = fin.readLine();
                if (fin == null) 
                    break;
                    byte[] p = str.getBytes(Charset.forName("UTF-8"));
                    String writeStr = new String(p);
                    fos.write(writeStr);
                    System.out.println(writeStr);   
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fin.close();
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
