package beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String unscrambled = unscrambleLine(line);
            System.out.println(unscrambled);
        }
    }

    public static String unscrambleLine(String line) {
        int length = line.length();
        StringBuilder unscrambled = new StringBuilder();

        for (int i = length / 2 - 1; i >= 0; i--) {
            unscrambled.append(line.charAt(i));
        }

        for (int i = length - 1; i >= length / 2; i--) {
            unscrambled.append(line.charAt(i));
        }

        return unscrambled.toString();
    }
}