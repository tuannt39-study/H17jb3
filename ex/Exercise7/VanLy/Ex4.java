package Exception;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        
        System.out.println(input() + input());
    }

    public static int input() {
        int a = 0;
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        while (a == 0) {
            try {
                String inp = sc.next();
                a = Integer.parseInt(inp);

            } catch (NumberFormatException e) {
                System.err.println("Input error. Re-enter your number");
            }
        }
        return a;
    }
}
