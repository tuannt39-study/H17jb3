package h17jb3.ex7.Streams;
//Tạo lớp NhanVien có các thuộc tính mã nhân viên, họ tên, tuổi và lương. 
//Viết setter, getter, constructor và toString.
//Viết phương thức cho phép nhập thông tin cho 3 nhân viên từ bàn phím. Sử dụng FileWriter để ghi thông tin vào nhanvien.txt.
//Viết phương thức để đọc nội dung file nhanvien.txt và in những gì đọc được từ file ra màn hình.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class B04 {
	
	public static void main(String[] args) throws IOException {
		B04 dt = new B04();
		File file = new File("/home/teo/Downloads/STUDY/JavaCore/src/h17jb3/tu6/Streams/bai4.txt");
		dt.writeFileChar(file);
		dt.readFileChar(file);
		
	}
	
	public void readFileChar(File file) throws IOException{
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String s;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		fr.close();
	}
	
	public void writeFileChar(File file) throws IOException{
		FileWriter fw;
		try {
			fw = new FileWriter(file);
		} catch (IOException exc) {
			System.out.println("Khong the mo file.");
			return;
		}
		ArrayList<NhanVien> ar = themNV(3);
		for (NhanVien a : ar) {
			a.toString();
			fw.write(a.toString());
		}
		fw.close();
		System.out.println("Ghi xong");
	}

	public ArrayList<NhanVien> themNV(int soluot) {
		ArrayList<NhanVien> ar = new ArrayList<>();
		for (int i = 0; i < soluot; i++) {
			NhanVien nv = new NhanVien();
			Scanner sc = new Scanner(System.in);
			String a, b;
			int c, d;

			System.out.print("Nhap ma nhan vien: ");
			a = sc.nextLine();
			nv.setMaNV(a);

			System.out.print("Nhap ho ten nhan vien: ");
			b = sc.nextLine();
			nv.setHoTen(b);

			System.out.print("Nhap tuoi nhan vien: ");
			c = sc.nextInt();
			nv.setTuoi(c);

			System.out.print("Nhap luong nhan vien: ");
			d = sc.nextInt();
			nv.setLuong(d);

			ar.add(nv);
		}
		return ar;
	}

}
