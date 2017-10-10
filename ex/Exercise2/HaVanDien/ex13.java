/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ex13 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j,min,max,k=0,sum,h=0;
        int b[]=new int[100];
        int c[]=new int[100];
        int a[][]=new int[10][10];
        System.out.print("Nhap vao so hang: ");
        n=sc.nextInt();
        System.out.print("\r\nNhap vao so cot: ");
        m=sc.nextInt();
        for(i=0;i<n;i++)
        {
            sum=0;
            for(j=0;j<m;j++)
            {
                System.out.print("A["+i+" "+j+"]= ");
                a[i][j]=sc.nextInt();
                sum+=a[i][j];
            }
            c[i]=sum;
        }
        
        // In ma tran
        System.out.println("Ma tran vua nhap la: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(+a[i][j]+"\t");
            }
            System.out.print("\r\n");
        }
          //min
          min=a[0][0];
          for(i=0;i<n;i++)
              for(j=0;j<m;j++)
              {
                  if(min>a[i][j])
                      min=a[i][j];
              }
          System.out.println("Phan tu nho nhat la: "+min);
          // pt le min
          for(i=0;i<n;i++)
              for(j=0;j<m;j++)
              {
                  if(a[i][j]%2==1)
                  { 
                      b[k]=a[i][j];
                      min=b[0];
                      if(b[k]<min)
                       min=b[k];   
                      k++;
                  }
                  }
              System.out.println("So le nho nhat: "+min);
          //hang co tong lon nhat
        max=c[0];
        for(i=0;i<n;i++)
            if(c[i]>max)
            {
                max=c[i];
                h=i;
            }
        System.out.println("Hang co tong lon nhat = "+max+" La hang: "+ (h+1));
    }
}
