package Excercise_3;

import java.util.Scanner;

/**
 * Created by minht on 4/24/2017.
 */
public class Ex2
{
    public static void main(String[] args) {
        findName("thuc");
//        String[] hoVaTen = "truong minh thuc".split(" ");
//        System.out.println(hoVaTen.length);
//        System.out.println(hoVaTen[hoVaTen.length-1]);
//        System.out.println("thuc".equals(hoVaTen[hoVaTen.length-1]));
    }
    private static String[] NameInitial(int number){
        String[] name = new String[number];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<number;i++){
            name[i] = scanner.nextLine();
        }
        return name;
    }
    private static boolean CheckName(String sample,String name){
        String[] hoVaTen = sample.trim().split(" ");
        if (name.equals(hoVaTen[hoVaTen.length-1])){
            return true;
        }else return false;
    }
    private static void findName(String name){
        String[] sample = NameInitial(3);
        StringBuilder stringBuilder = new StringBuilder();
        for (String a:sample) {
            if (CheckName(a,name)){
                stringBuilder.append(a+"\n");
            }
        }
        if (stringBuilder.length()!=0){
            System.out.println(stringBuilder.toString());
        }else System.out.println("ban da nhap sai ten");
    }
}
