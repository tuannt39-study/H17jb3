package JavaExerciseP1;

import java.util.Scanner;

/**
 * Created by MyPC on 18/04/2017.
 */
public class Ex3 {
    public static void main(String[] args) {
        float a;
        float b;
        float x;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao a");
        a=input.nextFloat();
        System.out.println("nhap vao b");
        b=input.nextFloat();
        x=-b/a;
        if (a==0){
            if (b==0)
                System.out.println("phuong trinh vo so nghiem ");
            else
                System.out.println("phuong trinh vo nghiem");
        }
        else
        System.out.println("phuong trinh co nghiem x=" + x);


    }
}
