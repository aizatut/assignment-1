import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter word: ");
        String s = sc.next();

        boolean res = isPalindrome(s);

        if (res == true) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

        sc.close();
    }
}
