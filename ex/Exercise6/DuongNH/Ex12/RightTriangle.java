/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex12;

/**
 *
 * @author Win7
 */
public class RightTriangle  extends Shape{
    int CanhVuong;
    
    public int getCanhVuong(){
        return CanhVuong;
    }
    
    public void setCanhVuong(int cv){
        CanhVuong = (cv>1&&cv<20?cv:1) ;
    }
}
