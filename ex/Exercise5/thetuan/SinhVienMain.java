package h17jb3.ex5;

public class SinhVienMain {

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien("01", "Nguyen Tuan", 6, 8);
		sv1.getDiemLT();
		sv1.getDiemTH();
		double dtb=((sv1.getDiemLT()+sv1.getDiemTH())/2);
		System.out.println("Diem trung binh: " + dtb);
		sv1.show();
		if (dtb>=5) System.out.println("OK");
		else System.out.println("NO");
	}

}
