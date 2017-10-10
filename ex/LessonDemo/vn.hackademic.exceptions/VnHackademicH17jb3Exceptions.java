/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.h17jb3.exceptions;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author haopv
 */
public class VnHackademicH17jb3Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        try {
            int [] arr = new int[3];
        String str = "1dslfadsfjchuongidm g";
        System.out.println(str.charAt(10));
        //System.out.println(str.substring(10));
        
            File f = new File("txtnd.txt");
            f.setWritable(true);
            
            Thread.sleep(100);
            System.out.println("Tỉnh dậy");
            
            int a = Integer.parseInt(str);
            System.out.println("a[4]: "+arr[4]);
        }  catch (StringIndexOutOfBoundsException sOEx){
            System.out.println("Lỗi outbout: "+sOEx.getMessage());
        //} catch (IOException ioE){
          //  System.out.println("loi file");
        } catch (InterruptedException ex) {
            System.out.println("Lỗi ngăt: "+ex.getMessage());
            //Logger.getLogger(VnHackademicH17jb3Exceptions.class.getName()).log(Level.SEVERE, null, ex);
        }catch (Exception e){
            System.out.println("co loi ");
        }
        finally{
            System.out.println("Don rac di");
        }
        
        System.out.println("Sau tat ca");
        */
        
        Student st = new Student();
        st.luong = 0;
        st.slouong = 10;
        
        try {
            st.tinhTB();
        } catch (InterruptedException ex) {
            Logger.getLogger(VnHackademicH17jb3Exceptions.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MyExcept mE){
            System.out.println("Lỗi: "+mE.msg+" Ma: "+ mE.code);
            mE.printStackTrace();
        }
    }
    
}

class Student{
    int ma;
    long luong;
    double tb;
    int slouong;
    
    public double tinhTB() throws MyExcept,InterruptedException{
        double rt=0;
        if(slouong == 0){
            throw new MyExcept("Loi chia 0", "1001");
            //throw new ArithmeticException();
        }
        if(luong == 0){
            throw new MyExcept("Khong có 0", "1002");
            //throw new ArithmeticException();
        }
        rt= luong/slouong;
        Thread.sleep(100);
        return rt;
    }
}

class MyExcept extends Exception{
    String msg = "";
    String code ="";

    public MyExcept(String msg, String cod) {
       this.msg = msg;
       this.code = cod;
    }
    
    
    
    
}
