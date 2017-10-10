package Excercise_4;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by minht on 4/28/2017.
 */
public class Dictionary  {
    private static String key,value;
    private static HashMap<String, String> hashMap;
    public static void main(String[] args) {
        System.out.println("Welcome to Custom Dictionary");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Them Tu");
        System.out.println("Tra tu?");
        int choise = scanner.nextInt();

        switch (choise){
            case 1:{
                System.out.println("Ban muon tao moi bao nhieu tu:?");
                int num = scanner.nextInt();
                scanner.nextLine();
                for (int i=0;i<num;i++){
                    InitialWord();
                }
                SaveData(hashMap);
                break;
            }default:{
                hashMap = loadup();
                System.out.println("Tra tu!");
                System.out.println("Nhap Tu ban muon tra");
                scanner.nextLine();
                String key = scanner.nextLine();
                System.out.println(hashMap.get(key));
                break;
            }
        }

    }
    private static HashMap<String,String> InitialWord(){
        hashMap = new HashMap<>();
        System.out.println("Nhap du lieu moi");
        System.out.println("Nhap theo Dinh dang sau: English : nghia tieng viet");
        System.out.println("VD: Somethings:vai thu");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        if (findinWord(tmp,":")){
            String[] parse = tmp.split(":");
            System.out.println(parse[0]+"     "+parse[1]);
            hashMap.put(parse[0],parse[1]);
            System.out.println("-----------");
        }else InitialWord();
        return hashMap;
    }
    private static boolean findinWord(String sample,String key){
        String[] tmp = sample.split("");
        boolean rs = false;
        for (String a:tmp) {
            if (key.equals(a)){
                rs = true;
                break;
            }else  rs=false;
        }
        return rs;
    }
    private static void SaveData(HashMap<String, String> hashMap){
        FileOutputStream fout = null;
        ObjectOutputStream oss = null;
        try {
            fout = new FileOutputStream("Dictionary.data");
            oss = new ObjectOutputStream(fout);
            oss.writeObject(hashMap);
            System.out.println("Done");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fout!=null){
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oss!=null){
                try {
                    oss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    private static HashMap<String, String> loadup(){

        try {
            FileInputStream file = new FileInputStream(new File("Dictionary.data"));
            ObjectInputStream objectInputStream = new ObjectInputStream(file);
            hashMap = (HashMap<String, String>) objectInputStream.readObject();
            file.close();
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashMap;
    }
}
