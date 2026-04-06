import java.util.Scanner;

public class ReverseString {
    static String reverse(String s) {
        if (s.length() == 0) {
            return "";
        }

        return reverse(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s = sc.nextLine();

        String result = reverse(s);

        System.out.println("reversed = " + result);

        sc.close();
    }
}