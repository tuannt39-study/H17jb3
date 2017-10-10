package stream_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import stream_IO.beans.StaffsManagement;
import stream_IO.beans.staffs;

public class ex5_io {
	// get staff's info --> write to txt file
		private static void writeStaffinfo(ArrayList<staffs> staffList) throws IOException{
			FileOutputStream fos = new FileOutputStream("mangnhanvien.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(staffList);
			
			oos.flush();
			oos.close();
		} 
		// read staff's info from file then print to screen
		private static void readStaffInfo(String sourceFile) throws IOException, ClassNotFoundException{
			FileInputStream fis = new FileInputStream(sourceFile);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// get info from file
			StaffsManagement staffManage =  (StaffsManagement) ois.readObject();
			ArrayList<staffs> staffsLi = staffManage.getStaffsList();
			
			// read then print to screen
			for(int i=0;i<staffsLi.size();i++){
				staffs staff = staffsLi.get(i);
				System.out.print("id: "+staff.getId());
				System.out.print("\tname: "+staff.getName());
				System.out.print("\tage: "+staff.getAge());
				System.out.print("\tsalary: "+staff.getSalary());
				System.out.println();
			}
			ois.close();
			
		}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner in = new Scanner(System.in);
		System.out.println("--Nhap thong tin cac nhan vien--");
		System.out.println("--Ma--Tuoi--Luong--Ten--");
		int id, age, salary;
		String name;
		StaffsManagement management = new StaffsManagement();
		do{
			id = in.nextInt();
			age = in.nextInt();
			salary = in.nextInt();
			name = in.nextLine();
			in = new Scanner(System.in);
			staffs staff = new staffs(id, age, salary, name);
			management.setStaffsList(staff);
			
		}
		while(id!=-1);
		writeStaffinfo(management.getStaffsList());
		System.out.println("done");
		readStaffInfo("mangnhanvien.dat");
	}

}
