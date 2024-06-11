package beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1255 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String mostFrequentLetters = findMostFrequentLetters(line);
            System.out.println(mostFrequentLetters);
        }
    }

    public static String findMostFrequentLetters(String line) {
        int[] frequency = new int[26];
        line = line.toLowerCase();

        for (char c : line.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                frequency[index]++;
            }
        }

        int maxFrequency = 0;
        for (int f : frequency) {
            maxFrequency = Math.max(maxFrequency, f);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (frequency[i] == maxFrequency) {
                result.append((char) ('a' + i));
            }
        }

        return result.toString();
    }
}