import java.util.Scanner;

public class SumSeries {
    public static double sum1(int i) {
        if (i == 1) {
            return 1.0;
        }
        return sum1(i - 1) + 1.0 / i;
    }
    public static double sum2(int i) {
        if (i == 1) {
            return 1.0 / 3;
        }
        return sum2(i - 1) + (double) i / (2 * i + 1);
    }
    public static double sum3(int i) {
        if (i == 1) {
            return 1.0 / 2;
        }
        return sum3(i - 1) + (double) i / (i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter i: ");
        int i = sc.nextInt();

        System.out.println("sum1(" + i + ") = " + sum1(i));
        System.out.println("sum2(" + i + ") = " + sum2(i));
        System.out.println("sum3(" + i + ") = " + sum3(i));

        sc.close();
    }
}
