package Excersice_1;

/**
 * Created by minht on 4/17/2017.
 */
public class ex4 {
    /*
    * giai phuong trinh bac 2
    * */
    public static void main(String[] args) {

    }
    private static float delta(float a,float b,float c){
        double tmp = b*b -4*a*c;
//        if ()
        return (float)Math.sqrt(tmp);
    }
    private static Object Slove(float a,float b,float c){
        float del = delta (a, b,c);
        String re ="";
        float[] x= new float[2];
        if(del==0){
//            return -b/2*a;
            x[0] = -b/2*a;
            x[1] = -b/2*a;
            return x;
        }else if (del<0){
            re = "Phuong trinh vo nghiem";
            return re;
         }else{
            x[0]=((-b+del)/(2*a));
            x[1]=((-b-del)/(2*a));
            return x;
        }
    }

}
