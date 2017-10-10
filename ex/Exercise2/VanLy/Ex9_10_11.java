/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hack_week1;


/**
 *
 * @author LilyEvans
 */
public class Ex9_10_11 {

    public static void main(String[] args) {
            System.out.println(fibo(5));
            System.out.println(tongChuSo(123456));
            System.out.println(checkPrime(11));
    }
/**
 * 
 * @param n
 * @return fibo n
 */
    public static long fibo(long n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
/**
 * 
 * @param n
 * @return sum of numbers of n
 */
    public static long tongChuSo(long n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
/**
 * 
 * @param n
 * @return true if n is prime, false if n is not prime
 */
    public static boolean checkPrime(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}