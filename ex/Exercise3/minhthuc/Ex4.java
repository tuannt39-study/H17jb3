package Excercise_3;

/**
 * Created by minht on 4/24/2017.
 */
public class Ex4 {
    public static void main(String[] args) {
        System.out.println(urlFile("/home/user/filename.png"));
//        String[] a = "/home/user/filename.png".split("/");
//        System.out.println(a[a.length-1]);
//        System.out.println(a[a.length-1].split("\\.")[1]);
    }
    private static String urlFile(String url){
        String[] urlArr = url.trim().split("/");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<urlArr.length-1;i++){
            stringBuilder.append(urlArr[i]+"/");
        }
        String name = "Directory:"+stringBuilder.toString();
        String[] Filename = urlArr[urlArr.length-1].trim().split("\\.");
        return name+"\n"+"File name:"+Filename[0]+"\n"+"Extension :"+Filename[1];
    }
}
