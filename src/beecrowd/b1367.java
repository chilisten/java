package beecrowd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b1367 {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int N = scanner.nextInt();
            if (N == 0) break;

            Map<Character, ProblemStatus> problems = new HashMap<>();
            int solvedProblems = 0;
            int totalTime = 0;

            for (int i = 0; i < N; i++) {
                char problemId = scanner.next().charAt(0);
                int time = scanner.nextInt();
                String judgement = scanner.next();

                ProblemStatus status = problems.getOrDefault(problemId, new ProblemStatus());

                if (judgement.equals("correct")) {
                    if (!status.solved) {
                        status.solved = true;
                        status.time = time;
                        solvedProblems++;
                        totalTime += time + (status.incorrectAttempts * 20);
                    }
                } else {
                    status.incorrectAttempts++;
                }

                problems.put(problemId, status);
            }

            System.out.println(solvedProblems + " " + totalTime);
        }

        scanner.close();
    }

    static class ProblemStatus {
        boolean solved = false;
        int time = 0;
        int incorrectAttempts = 0;
    }
}