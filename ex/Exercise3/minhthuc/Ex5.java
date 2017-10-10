package Excercise_3;

/**
 * Created by minht on 4/24/2017.
 */
public class Ex5 {
    public static void main(String[] args) {

        }
        private static void countWord(String a){
            String[] test = a.split(" ");
            int num=0;
            int word = 0;
            for (String b:test){
                try{
                    if (Integer.parseInt(b)>=0){
                        num++;
                    }
                }catch (Exception e){
                    word++;
                }
            }
            System.out.println(num+"  "+word);
        }
    }
//    private static int WordCount(){
//
//    }
