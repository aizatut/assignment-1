import java.util.Scanner;

public class DecimalBinary {

    static String dec2bin(int n) {
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        return dec2bin(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int n = sc.nextInt();


        String result = dec2bin(n);
        System.out.println("binary = " + result);
        sc.close();
    }
}