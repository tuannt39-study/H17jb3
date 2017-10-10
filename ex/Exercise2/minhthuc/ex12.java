package Exercise_2;

/**
 * Created by minht on 4/17/2017.
 */
public class ex12 {
    private static String aOption(int[] a){
        String string = "";
        for (int  i=0;i<a.length;i++){
            string +=a[i]+" ";
        }
        return string;
    }
    public static int[] sort(int[] a){
        int leng = a.length;
        for (int i = 0;i<leng;i++){
            for (int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    int tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                }
            }
        }
        return a;
    }
    public static int min(int[] a){
        sort(a);
        return a[0];
    }
    public static int max(int[] a){
        sort(a);
        return a[a.length-1];
    }
    public static int EvenCounting(int[] a){
        int i = 0;
        for (int b :
                a) {
            if (b%2==0){
                i++;
            }
        }
        return i;
    }
//    public static int Searching(int[] a,int x){
//        int head=0,bottom=a.length-1;
//        int mid = (head+bottom)/2;
//        for ()
//    }
    public static int RecursiveBinarySearch(int[] a,int head,int tail){
        int mid = (tail+head)/2;
        return mid;
    }
    public static void main(String[] args) {
        int[] a = {2,5,6,7,1,3};
        System.out.println(aOption(sort(a)));
    }

}
