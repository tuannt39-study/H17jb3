package h17jb3.ex4;

import java.util.HashSet;

public class NhanVienHashSet {

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("NV001", 1);
		NhanVien nv2 = new NhanVien("NV002", 2);
		NhanVien nv3 = new NhanVien("NV003", 3);
		NhanVien nv4 = new NhanVien("NV004", 4);
		
		HashSet<NhanVien> nv = new HashSet<NhanVien>();
		nv.add(nv1);
		nv.add(nv2);
		nv.add(nv3);
		nv.add(nv4);
		nv.add(new NhanVien("NV005", 5));
		
		for (Object object: nv) {
			System.out.println("Bài 1: " + object);
		}
	}

}
