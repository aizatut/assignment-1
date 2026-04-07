import java.util.Scanner;
public class DecimalBinary {
    static String dec2bin(int n) {
        if (n==0) {
            return "0";
        }
        if (n==1) {
            return "1";
        }
        return dec2bin(n/2) + (n%2);
    }
}