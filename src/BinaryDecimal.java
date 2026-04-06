import java.util.Scanner;

public class BinaryDecimal {

    static int bin2dec(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int last = s.charAt(s.length() - 1) - '0';

        return last + 2 * bin2dec(s.substring(0, s.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter binary: ");
        String s = sc.nextLine();

        int result = bin2dec(s);

        System.out.println("decimal = " + result);

        sc.close();
    }
}
