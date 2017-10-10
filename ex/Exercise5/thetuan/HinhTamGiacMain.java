package h17jb3.ex5;

import java.util.Scanner;

public class HinhTamGiacMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ma, mb, mc;
		System.out.print("Canh A=");
		ma=sc.nextInt();
		System.out.print("Canh B=");
		mb=sc.nextInt();
		System.out.print("Canh C=");
		mc=sc.nextInt();
		HinhTamGiac tg = new HinhTamGiac();
		tg.setCanhA(ma);
		tg.setCanhB(mb);
		tg.setCanhC(mc);
		if (ma<=0 || mb<=0 || mc<=0 ) {
			System.out.println("-Khong phai hinh tam giac");
		} else {
			if (tg.laTamGiac()==false){
				System.out.println("--Khong phai hinh tam giac");
			} else {
				System.out.println("La hinh tam giac");
				tg.getChuVi();
				tg.getDienTich();
			}
		}
		
		HinhTamGiac tg2 = new HinhTamGiac();
		boolean t=tg2.laTamGiac(3,4,5);
		if (t==false){
			System.out.println("--Khong phai hinh tam giac 2");
		} else {
			System.out.println("La hinh tam giac 2");
			tg.getChuVi();
			tg.getDienTich();
		}
	}
}