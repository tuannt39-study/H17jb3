
public class ex4 {
	public static void main(String[] args) {
		String str= "/home/user/filename.png";
		int vt1= str.lastIndexOf("/");
		int vt2= str.indexOf(".");
		System.out.println(str.substring(vt1+1,vt2));
		System.out.println(str.substring(vt2+1));
		System.out.println(str);
	}

}
