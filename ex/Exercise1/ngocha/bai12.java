package bai_tap;

import java.util.Scanner;

import javax.xml.bind.SchemaOutputResolver;

public class bai12{
	private static Scanner sn;
	private static Scanner sc;
	
	public bai12(){
		
	}
	public static int Max(int[] list){
		int max=-1000000000;
		for(int a:list){
			if(a>=max){
				max=a;
			}
		}
		if(max==0){
		
		}
		return max;
	}
	public static int Min(int[] list){
		int min= Max(list);
		for(int a:list){
			if(a<=min){
				min=a;
			}
		}
		return min;
	}
	public static int countOddNum(int[] list){
		int c=0;
		for(int a:list){
			if(a%2==0){
				c+=1;
			}
		}
		return c;
	}
	public static void primeNum(int[] list){
		boolean f= false;
		for (int soNhap:list){
			double b= Math.sqrt(soNhap);
			for (int i=2; i <= b; i++){
				if(soNhap%i==0){ 
					f=true;
					break;
				}
				else f=false;
			}
			if(!f)System.out.print(soNhap+" ");
		}
		System.out.println("");
	}
	public static void sort(int[] list){
		int[] sortedArr =new int[list.length];
		int[] copList= new int [list.length];
		for(int i=0;i<list.length;i++){
			copList[i]=list[i];
		}
		for(int i=0;i<list.length;i++){
			sortedArr[i]=Min(copList);
			for(int j=0; j<list.length;j++){
				if(copList[j]==Min(copList)){
					copList[j]=Max(list);
					break;
				}
			}
		}
		for(int b:sortedArr){
			System.out.print(b+" ");
		}
		System.out.println(" ");
	}
	public static void searchNum(int x,int[] list){
		boolean bl= false;
		for(int b: list){
			if(x==b) {
				bl=true; 
				break;
				}
			else bl=false;
		}
		if(bl)System.out.println("co phan tu x");
		else System.out.println("ko co phan tu ban nhap");
	}
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Nhap phan tu cua mang n:");
		int n= sc.nextInt();int[] arr= new int[n];
		try{	
			System.out.println("nhap n so");
			sn = new Scanner(System.in);
			for(int i=0; i< arr.length;i++){
				arr[i]=sn.nextInt();
			}
			for(int a:arr){
				System.out.print(a+" ");
			}
			System.out.println(" ");
		}catch(Exception e){
			System.out.println("Ban da lam sai j do");
		}
		System.out.println("Max: "+Max(arr));
		System.out.println("Min: "+Min(arr));
		System.out.println("So so chan la: "+countOddNum(arr));
		System.out.println("cac so SNT la:");
		primeNum(arr);
		System.out.println("Day da sort la:");
		sort(arr);
		System.out.print("nhap so can tim: ");
		int x= (new Scanner(System.in)).nextInt();
		searchNum(x, arr);
		
	}
}