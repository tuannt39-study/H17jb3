
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Ex12 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the length of array: ");
         int num = sc.nextInt();

         int [] arr = new int[num];
         for(int i = 0; i < arr.length; i++){
             System.out.println("Enter the number " +(i+1) + " of array. ");
             arr[i] = sc.nextInt();
         }
     
         System.out.println("MENU !!!");
         System.out.println("1. Show the each value of array. ");
         System.out.println("2. Find the min and max value of array. ");
         System.out.println("3. Count the even value. ");
         System.out.println("4. Find the prime value of array. ");
         System.out.println("5. Sort array in asc. ");
         System.out.println("6. Find the x value. ");

            System.out.println("Please enter a number to select : ");
            int select = sc.nextInt();
            if(1 > select || 6 < select){
                System.err.println("You entered incorrectly, please try again ! ");
                select = sc.nextInt();
            }
            switch(select){
                case 1:
                   printArray(arr);
                    break;
                case 2:
                   minMax(arr);
                   break;
                case 3:
                    evenNumber(arr);
                  break;
                case 4:
                   isPrime(arr);
                    break;
                case 5:
                    sortArr(arr);
                    break;
                case 6:
                    System.out.println("Enter your number: ");
                    int a = sc.nextInt();
                    xValue(a, arr);
                    break;
                case 7:
                    System.exit(1);
                default:
                    break;
            }
        } 
    
     
      public static void printArray(int [] a){
          System.out.println("Print array: ");
          for(int i = 0; i < a.length; i++){
              System.out.println(Arrays.toString(a));
          }
      }
      public static void minMax(int [] a){
          int max = 0;
          int min = 0;
          for(int i = 0; i < a.length -1 ; i++){
          for(int j = i+1; j < a.length; j++){
              if(a[i] > a[j]){
               int temp = a[i];
               a[i] = a[j];
               a[j] = temp;
              }
          }
      }
          for(int i = 0; i < a.length ; i++){
          System.out.println("Max value is : " +a[a.length]);
          System.out.println("Min value is: " +a[0]);
      }
}
      public static void evenNumber(int [] a){
          int count = 0;
          for(int i = 0; i < a.length; i++){
              if(a[i] % 2 == 0){
                  count += 1;
      }
              System.out.println("The total even number of array is:  " +count);
          }
      }
      public static void isPrime(int [] a){
          System.out.println("The prime numbers are: ");
          for(int i = 0; i < a.length; i++){
             if(a[i] % (i+2) == 0){
                  System.out.print(a[i]);
                  System.out.print(" ");
              }
          }
         
      }
      public static void sortArr(int [] a){
           Boolean isSorted = false;
        while (!isSorted)
        {
            isSorted=true;
            for (int i=0; i<a.length-1; i++)
                if (a[i]>a[i+1])
                {
                    int tmp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=tmp;
                    isSorted=false;
                }
        }
        System.out.println("The list of sorted integers is: ");  
          System.out.println(Arrays.toString(a));
    }
      public static void xValue(int x, int [] a){
           System.out.println
        
        
        ("Value " +x  + " is in the ");
          for(int i = 0; i < a.length; i ++){
              if(a[i] == x){
                  System.out.println(i + " position of array. ");
              }
          }
      }
}
 

