import java.math.BigInteger;
import java.util.Scanner;

    public class BigFactorial {

        static BigInteger factorial(int n) {
            if (n == 0 || n == 1) {
                return BigInteger.ONE; // ну типо 0! и 1! это 1
            }
            return BigInteger.valueOf(n).multiply(factorial(n - 1)); // просто умножаем
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("enter number:");
            int n = sc.nextInt();

            BigInteger res = factorial(n);

            System.out.println("factorial = " + res);
        }
    }
