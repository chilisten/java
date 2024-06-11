package beecrowd;

import java.util.*;

public class b1581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            int K = scanner.nextInt();
            scanner.nextLine();

            Set<String> languages = new HashSet<>();
            Map<String, Integer> languageCount = new HashMap<>();

            for (int j = 0; j < K; j++) {
                String language = scanner.nextLine();
                languages.add(language);
                languageCount.put(language, languageCount.getOrDefault(language, 0) + 1);
            }

            if (languages.size() >= 2) {
                System.out.println("ingles");
            } else {
                String mostCommonLanguage = Collections.max(languageCount.entrySet(), Map.Entry.comparingByValue()).getKey();
                System.out.println(mostCommonLanguage);
            }
        }

        scanner.close();
    }
}