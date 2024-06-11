package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class b1332 {


    public static int getWordValue(String word) {
        if (word.length() == 3) {
            if (matches(word, "one")) {
                return 1;
            }
            if (matches(word, "two")) {
                return 2;
            }
        } else if (word.length() == 5) {
            if (matches(word, "three")) {
                return 3;
            }
        }
        return -1;
    }


    public static boolean matches(String word, String target) {
        int mismatches = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != target.charAt(i)) {
                mismatches++;
                if (mismatches > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine();
            int value = getWordValue(word);
            System.out.println(value);
        }

        scanner.close();
    }
}