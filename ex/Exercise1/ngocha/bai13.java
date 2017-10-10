package bai_tap;

import java.util.Scanner;

import javax.print.attribute.standard.Copies;

public class bai13 {
	private static Scanner scanner;
	private static Scanner sn,sc;

	public static int searchMax(int[][] matrix){
		int max=-1000000000;
		bai12 b12=new bai12();
		for (int i=0;i<matrix.length;i++){
			if(max<= b12.Max(matrix[i])) max=b12.Max(matrix[i]);
		}
		return max;
	}
	public static int searchMin(int[][] matrix){
		int min =1000000000;
		bai12 b12=new bai12();
		for(int i=0; i<matrix.length;i++){
			if(min>=b12.Min(matrix[i])) min=b12.Min(matrix[i]);
		}
		return min;
	}
	public static void primeNum(int[][] matrix){
		bai12 b12= new bai12();
		for(int i=0; i<matrix.length;i++){
			b12.primeNum(matrix[i]);
		}
	}
	public static void sort(int[][] matrix){
		bai12 b12= new bai12();
		for(int i=0; i<matrix[i].length;i++){
		}
	}
	public static void search(int[][] matrix,int x){
		for(int i=0; i<matrix.length;i++){
			for(int j=0; j<matrix[i].length;j++){
				if(x==matrix[i][j]){
					System.out.println("vi tri la:");
					System.out.println(i+";"+j);
				}
			}
		}
	}
	public static void main(String[] args) {
		sn = new Scanner(System.in);
		System.out.print("Nhap n va m: ");
		int n=sn.nextInt();
		int m=sn.nextInt();
		// khoi tao ma tran
		int[][] Mt= new int[n][m];
		for(int i=0; i<n; i++){
			for (int j=0; j<m;j++){
				scanner = new Scanner(System.in);
				System.out.println("nhap phan tu Mt["+(i+1)+"]"+"["+(j+1)+"]");
				Mt[i][j]=scanner.nextInt();
			}
		}
		for(int i=0; i<n; i++){
			for (int j=0; j<m;j++){
				System.out.print(Mt[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("Max:"+searchMax(Mt));
		search(Mt,searchMax(Mt));
		System.out.println("min:"+searchMin(Mt));
		search(Mt, searchMin(Mt));
		System.out.println("So nguyen to");
		primeNum(Mt);
	}
}
