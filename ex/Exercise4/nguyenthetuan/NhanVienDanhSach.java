package h17jb3.ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import h17jb3.ex2.B12;

public class NhanVienDanhSach {
	private ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
	private int tongSoNV;
	private long tongLuong;

	protected void addNV(NhanVien nv) {
		dsnv.add(nv);
		this.tongLuong = tongLuong + nv.getLuong();
		this.tongSoNV = this.dsnv.size();
	}

	protected void addNVFrom() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Them 1 nhan vien:");
		NhanVien nv = new NhanVien();
		System.out.println("Nhap ma nhan vien: ");
		nv.setMaNV(sc.nextLine().toString());
		System.out.println("Nhap so san pham: ");
		nv.setSoSP(sc.nextInt());
		this.addNV(nv);
	}

	protected int spMin() {
		int min;
		min = this.dsnv.get(0).getSoSP();
		for (NhanVien nv : this.dsnv) {
			if (min > nv.getSoSP())
				min = nv.getSoSP();
		}
		return min;
	}

	protected long luongMax() {
		long max;
		max = this.dsnv.get(0).getLuong();
		for (NhanVien nv : this.dsnv) {
			if (max < nv.getLuong())
				max = nv.getLuong();
		}
		return max;
	}

	public void timNV() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma nhan vien can tim: ");
		String ID;
		ID = sc.nextLine();
		for (int i = 0; i < dsnv.size(); i++) {
			if (ID.equalsIgnoreCase(dsnv.get(i).getMaNV())) {
				System.out.println("Thong tin cua nhan vien can tim: \n" + dsnv.get(i).toString());
			}
		}
	}

	public void sapXepNV() {
		for (int i = 0; i < dsnv.size(); i++) {
            System.out.println(dsnv.get(i).toString());
        }
	}

	public void xoaNV() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vi tri cua nhan vien ma ban muon xoa: ");
		int pos = sc.nextInt();
		int count = dsnv.size();
		while (pos > count) {
			System.out.println("Nhan vien khong ton tai. Nhap lai: ");
			pos = sc.nextInt();
		}
		for (int i = 1; i <= count; i++) {
			if (i == pos) {
				dsnv.remove(pos);
			}
		}
		if (dsnv.size() == 0) {
			System.out.println("Empty.");
			System.exit(0);
		}
		for (int i = 1; i <= dsnv.size(); i++) {
			System.out.print(i + " " + " " + " " + " ");
			System.out.println(dsnv.get(i - 1).toString());
		}
		System.out.println("--------------------------------------------");
	}

	protected void show() {
		for (NhanVien nv : this.dsnv) {
			nv.show();
		}
		System.out.println("So luong nhan vien: " + this.tongSoNV);
		System.out.println("Tong so luong: " + this.tongLuong);
	}

	public ArrayList<NhanVien> getDsnv() {
		return dsnv;
	}

	public void setDsnv(ArrayList<NhanVien> dsnv) {
		this.dsnv = dsnv;
	}

	public int getTongSoNV() {
		return tongSoNV;
	}

	public void setTongSoNV(int tongSoNV) {
		this.tongSoNV = tongSoNV;
	}

	public long getTongLuong() {
		return tongLuong;
	}

	public void setTongLuong(long tongLuong) {
		this.tongLuong = tongLuong;
	}

}
