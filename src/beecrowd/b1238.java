package beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1238 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String combined = combineStrings(input[0], input[1]);
            System.out.println(combined);
        }
    }

    public static String combineStrings(String str1, String str2) {
        StringBuilder combined = new StringBuilder();
        int length1 = str1.length();
        int length2 = str2.length();
        int maxLength = Math.max(length1, length2);

        for (int i = 0; i < maxLength; i++) {
            if (i < length1) {
                combined.append(str1.charAt(i));
            }
            if (i < length2) {
                combined.append(str2.charAt(i));
            }
        }

        return combined.toString();
    }
}
