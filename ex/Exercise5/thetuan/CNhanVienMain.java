package h17jb3.ex5;

public class CNhanVienMain {

	public static void main(String[] args) {
		CNhanVien nv11 = new CNhanVien();
		nv11.setmHo("Nguyen");
		nv11.setmTen("Tuan");
		nv11.setmSoSP(300);
		double luong=nv11.getLuong();
		System.out.println("Luong nv1=" + luong);
		CNhanVien nv22 = new CNhanVien();
		nv22.setmHo("Tran");
		nv22.setmTen("Tuan");
		nv22.setmSoSP(500);
		double luong2=nv22.getLuong();
		System.out.println("Luong nv2=" + luong2);
		
		CNhanVien nv = new CNhanVien();
		System.out.println("Lan 1");
		if (nv.NhieuHon()==true){
			System.out.println("nv 1 > nv 2");
		} else System.out.println("nv 1 < nv 2");
		System.out.println("Lan 2");
		if (nv11.getmSoSP()>nv22.getmSoSP()){
			System.out.println("nv 1 > nv 2");
		} else System.out.println("nv 1 < nv 2");
	}
}
