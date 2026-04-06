import java.util.Scanner;
public class StringPermutation {
    static void printPermutations(String s) {
        permute("", s);
    }

    static void permute(String first, String second) {
        if (second.length() == 0) {
            System.out.println(first);
        }
        for (int i = 0; i < second.length(); i++) {
            char ch = second.charAt(i);
            String left = second.substring(0, i);
            String right = second.substring(i + 1);
            permute(first + ch, left + right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String s = sc.nextLine();
        printPermutations(s);

        sc.close();
    }
}
