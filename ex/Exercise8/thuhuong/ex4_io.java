package stream_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import stream_IO.beans.staffs;

public class ex4_io {
	
	// get staff's info --> write to txt file
	private static void writeStaffinfo(staffs staff) throws IOException{
		FileOutputStream fos = new FileOutputStream("nhanvien.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(staff);
		
		oos.flush();
		oos.close();
	} 
	// read staff's info from file then print to screen
	private static void readStaffInfo(String sourceFile) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(sourceFile);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		staffs staff = (staffs) ois.readObject();
		System.out.print("id: "+staff.getId());
		System.out.print("\tname: "+staff.getName());
		System.out.print("\tage: "+staff.getAge());
		System.out.print("\tsalary: "+staff.getSalary());
		System.out.println();
		
		ois.close();
		
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner in = new Scanner(System.in);
		System.out.println("--Nhap thong tin 3 nhan vien--");
		System.out.println("--Ma--Tuoi--Luong--Ten--");
		int id, age, salary;
		String name;
		
		do{
			id = in.nextInt();
			age = in.nextInt();
			salary = in.nextInt();
			name = in.nextLine();
			
			staffs staff = new staffs(id, age, salary, name);
			writeStaffinfo(staff);
			readStaffInfo("nhanvien.txt");
		}
		while(id!=-1);
		// readStaffInfo("nhanvien.txt"); -- this position cannot run
	}
	
}
