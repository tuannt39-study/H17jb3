package Excercise_3;

import java.util.Scanner;

/**
 * Created by minht on 4/24/2017.
 */
public class Ex3 {
    private static String nameInitial(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }

    private static String sortName(String name){
        String[] nameArr = name.trim().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String a:nameArr) {
               stringBuilder.append(a.split("")[0]);
        }
        return stringBuilder.toString();
    }
}
