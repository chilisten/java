package beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String A = input[0];
            String B = input[1];

            if (fitsLastDigits(A, B)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }
    }

    public static boolean fitsLastDigits(String A, String B) {
        if (B.length() > A.length()) {
            return false;
        }

        int indexA = A.length() - 1;
        int indexB = B.length() - 1;

        while (indexB >= 0) {
            if (A.charAt(indexA) != B.charAt(indexB)) {
                return false;
            }
            indexA--;
            indexB--;
        }

        return true;
    }
}