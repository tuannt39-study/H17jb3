package h17jb3.ex5;

import java.util.ArrayList;

public class NhanVienB6Main {

	public static void main(String[] args) {
		NhanVienB6 nv1 = new NhanVienB6(1, "Nguyen Tuan", "Ha Noi", null);
		NhanVienB6 nv2 = new NhanVienB6(2, "Nguyen Tuan", "Ha Noi", true);
		NhanVienB6 nv3 = new NhanVienB6(3, "Nguyen Tuan", "Ha Noi", false);
		nv1.show();
		nv2.show();
		nv3.show();

		ArrayList<NhanVienB6> nv = new ArrayList<>();
		nv.add(nv1);
		nv.add(nv2);
		nv.add(nv3);
		System.out.println("La CBQL");
		for (NhanVienB6 a: nv){
			if (a.getCBQL()!=null) {
				System.out.println(a.getCBQL().toString());
			}
		}
	}

}
