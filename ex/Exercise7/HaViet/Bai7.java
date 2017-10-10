/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author VIET - HP8570W
 */
public class Bai7 {

    public static void main(String[] args) {
        System.out.println("Exception date");
        //
        boolean check;
        do {
            check = true;
            Scanner in = new Scanner(System.in);
            try {
                SimpleDateFormat sf = new SimpleDateFormat("dd-M-yyyy");
                System.out.print("Nhap ngay thang nam : ");
                String dateStr = in.nextLine();
                Date date = sf.parse(dateStr);
                System.out.println(date);
            } catch (ParseException e) {
                System.out.println("Khong dung dinh dang");
                check = false;
            }
        } while (!check);
    }
}
