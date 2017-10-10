import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        System.out.println("Enter your calculataion: ");
        Scanner sc = new Scanner(System.in);
        String stream = sc.nextLine();
        Calculate(seperate(stream));
    }

    public static String[] seperate(String stream) {
        stream.trim();
        return stream.split(" ");
    }

    public static void Calculate(String[] stream) {
        int a = toDigit(stream[0]);
        int result = 0;
        switch (stream[1]) {
            case "+":
                result = a + toDigit(stream[2]);
                break;
            case "-":
                result = a - toDigit(stream[2]);
                break;
            case "*":
                result = a * toDigit(stream[2]);
                break;
            case "/":
                result = a / toDigit(stream[2]);
                break;
            default:
                break;
        }
        System.out.println(result);
    }

    public static int toDigit(String a) {
        try {
            return Integer.parseInt(a);
        } catch (NumberFormatException e) {
            System.out.println("Wrong input: " + a + e);
            return 0;
        }
    }
}
