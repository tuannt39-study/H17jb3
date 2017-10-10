package h17jb3.ex4;

import h17jb3.ex4.NhanVienDanhSach;

import java.util.Scanner;

import h17jb3.ex4.NhanVien;

public class NhanVienMain {

	public static void main(String[] args) {
		NhanVien n1 = new NhanVien();
		NhanVien n2 = new NhanVien("NV002", 2);
		NhanVien n3 = new NhanVien("NV003", 3);
		NhanVien n4 = new NhanVien("NV004", "Nguyen The Tuan", 5, 4000);
		NhanVien n5 = new NhanVien("NV005", "Nguyen The Tuan", 4, 5000);
		
		NhanVienDanhSach ds = new NhanVienDanhSach();
		
		ds.addNV(n1);
		ds.addNV(n2);
		ds.addNV(n3);
		ds.addNV(n4);
		ds.addNV(n5);
		System.out.println("Danh sach:");
		ds.show();
		ds.addNVFrom();
		System.out.println("Danh sach:");
		ds.show();
		System.out.println("Min sp: " + ds.spMin());
		System.out.println("Max luong: " + ds.luongMax());
		int chon = 0;
		System.out.println("1. Tim nhan vien. ");
		System.out.println("2. Sap xep nhan vien theo so san pham tang dan. ");
		System.out.println("3. Xoa 1 nhan vien tai vi tri nhap vao. ");
		System.out.println();
		System.out.println("Nhap lua chon: ");
		Scanner sc = new Scanner(System.in);
		chon = sc.nextInt();
		switch (chon) {
		case 1:
			ds.timNV();
			break;
		case 2:
			ds.sapXepNV();
			break;
		case 3:
			ds.xoaNV();
			break;
		default:
			break;
		}
	}

}
