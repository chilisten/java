package beecrowd;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class b120 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String D = scanner.next();
            String N = scanner.next();
            if (D.equals("0") && N.equals("0")) break;

            BigInteger result = removeDigit(new BigInteger(D), new BigInteger(N));
            System.out.println(result);
        }

        scanner.close();
    }

    public static BigInteger removeDigit(BigInteger digit, BigInteger number) {
        BigInteger result = BigInteger.ZERO;
        BigInteger multiplier = BigInteger.ONE;

        while (!number.equals(BigInteger.ZERO)) {
            BigInteger remainder = number.mod(BigInteger.TEN);
            if (!remainder.equals(digit)) {
                result = result.add(remainder.multiply(multiplier));
                multiplier = multiplier.multiply(BigInteger.TEN);
            }
            number = number.divide(BigInteger.TEN);
        }

        return result;
    }
}