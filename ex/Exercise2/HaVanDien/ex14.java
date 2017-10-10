/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ex14 {
    public static void main(String[] args)
    {
        int n,m,i,j,max=0,k,h=0,c=0;
        int a[][]=new int[10][10];
        int b[][]=new int[10][10];
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao so hang: ");
        n=sc.nextInt();
        System.out.print("\r\nNhap vao so cot: ");
        m=sc.nextInt();
        for(i=0;i<n;i++)
            for(j=0;j<m;j++)
            {
                System.out.print("A["+i+j+"]= ");
                a[i][j]=sc.nextInt();
                for(k=2;k*k<=a[i][j];k++)
                {
                    if(a[i][j]%k==0)
                        break;
                    else if(k+1>sqrt(a[i][j]))
                        b[i][j]=a[i][j];
                    else
                        b[i][j]=0;
                            
                }
            }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(+a[i][j]+" ");
            }
            System.out.print("\r\n");
        }
        //phan tu max
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
                if(max<a[i][j])
                {
                    max=a[i][j];
                    h=i+1;
                    c=j+1;
                }
        System.out.println(" O hang: "+h+" phan tu lon nhat la: "+max +" Cot:"+c);
        }
        //ma tran so nguyen
        System.out.println("Cac so nguyen cua ma tran la: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(+b[i][j]+" ");
            }
            System.out.print("\r\n");
        }
        for(j=0;j<m;j++)
            for(i=0;i<n;i++)
                for(k=n-1;k>i;k--)
                    if(a[k][j]<a[k-1][j])
                    {
                        int tg=a[k][j];
                        a[k][j]=a[k-1][j];
                        a[k-1][j]=tg;
                    }
        System.out.println("Ma tran sau khi sap xep: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(+a[i][j]+" ");
            }
            System.out.print("\r\n");
        }
    }
}
