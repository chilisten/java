package beecrowd;

import java.util.Scanner;

public class b1516 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            if (N == 0 && M == 0) break;

            scanner.nextLine();

            char[][] original = new char[N][M];
            for (int i = 0; i < N; i++) {
                original[i] = scanner.nextLine().toCharArray();
            }

            int A = scanner.nextInt();
            int B = scanner.nextInt();
            scanner.nextLine();

            char[][] resized = new char[A][B];

            int rowScale = A / N;
            int colScale = B / M;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    for (int k = 0; k < rowScale; k++) {
                        for (int l = 0; l < colScale; l++) {
                            resized[i * rowScale + k][j * colScale + l] = original[i][j];
                        }
                    }
                }
            }

            for (int i = 0; i < A; i++) {
                System.out.println(resized[i]);
            }
            System.out.println();
        }

        scanner.close();
    }
}