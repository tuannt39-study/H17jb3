package h17jb3.ex7.Streams;
//NhanVien có các thuộc tính mã nhân viên, họ tên, tuổi và lương và thực hiện các xử lý sau
//Viết phương thức tạo mảng 3 nhân viên, nhập thông tin cho các nhân viên, sử dụng ObjectOutputStream để ghi mảng đối tượng nhân viên vào file nhanvien.dat
//Viết phương thức để đọc file nhanvien.dat và in mảng nhân viên ra màn hình.
//Viết chương trình đọc tập tin nhanvien.dat và hiển thị ra màn hình các thông tin: nhân viên có mã NV lớn nhất; tổng lương của các nhân viên trong tập tin.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class B05 {
	public static void main(String[] args) throws IOException {
		B05 dt = new B05();
		FileOutputStream file = new FileOutputStream("/home/teo/Downloads/STUDY/JavaCore/src/h17jb3/tu6/Streams/bai5.dat");
		dt.writeFileCharB5(file);
		FileInputStream file2 = new FileInputStream("/home/teo/Downloads/STUDY/JavaCore/src/h17jb3/tu6/Streams/bai5.dat");
		dt.readFileCharB5(file2);
		
	}
	
	public void readFileCharB5(FileInputStream file) throws IOException{
		ObjectInputStream oos;
		oos = new ObjectInputStream(file);
		String s = oos.readUTF();
		System.out.println(s);
		oos.close();
		System.out.println("Đọc xong");
	}
	
	public void writeFileCharB5(FileOutputStream file) throws IOException{
		ObjectOutputStream oos;
		oos = new ObjectOutputStream(file);
		try {
			ArrayList<NhanVien> ar = themNVB5(3);
			for (NhanVien a : ar) {
				a.toString();
				oos.writeUTF(a.toString());
			}
		} catch (IOException exc) {
			System.out.println("Lỗi ghi file." + exc);
		}
		oos.close();
		System.out.println("Ghi xong");
		
	}
	
	public ArrayList<NhanVien> themNVB5(int soluot) {
		ArrayList<NhanVien> ar = new ArrayList<>();
		for (int i = 0; i < soluot; i++) {
			NhanVien nvb5 = new NhanVien();
			Scanner sc = new Scanner(System.in);
			String a, b;
			int c, d;

			System.out.print("Nhap ma nhan vien: ");
			a = sc.nextLine();
			nvb5.setMaNV(a);

			System.out.print("Nhap ho ten nhan vien: ");
			b = sc.nextLine();
			nvb5.setHoTen(b);

			System.out.print("Nhap tuoi nhan vien: ");
			c = sc.nextInt();
			nvb5.setTuoi(c);

			System.out.print("Nhap luong nhan vien: ");
			d = sc.nextInt();
			nvb5.setLuong(d);

			ar.add(nvb5);
		}
		return ar;
	}
	
}
