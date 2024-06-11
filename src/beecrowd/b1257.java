package beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int L = Integer.parseInt(br.readLine());
            int hash = 0;

            for (int j = 0; j < L; j++) {
                String line = br.readLine();
                hash += calculateHash(line, j);
            }

            System.out.println(hash);
        }
    }

    public static int calculateHash(String line, int element) {
        int hash = 0;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            int alphabetPosition = c - 'A';
            hash += alphabetPosition + element + i;
        }

        return hash;
    }
}