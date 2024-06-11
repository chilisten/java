package beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1551 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String sentence = br.readLine();
            String category = getCategory(sentence);
            System.out.println(category);
        }
    }

    public static String getCategory(String sentence) {
        boolean[] alphabet = new boolean[26];
        int count = 0;

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                if (!alphabet[index]) {
                    alphabet[index] = true;
                    count++;
                }
            }
        }

        if (count == 26) {
            return "frase completa";
        } else if (count >= 13) {
            return "frase quase completa";
        } else {
            return "frase mal elaborada";
        }
    }
}