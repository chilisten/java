package Laboratorki1;
import java.util.*;



public class lb1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 2, 3, 3, 1};
        List<Integer> result = removeOddOccurrences(numbers);
        System.out.println("Результат: " + result);
    }

    public static List<Integer> removeOddOccurrences(int[] numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : numbers) {
            if (countMap.get(num) % 2 == 0) {
                result.add(num);
            }
        }

        return result;
    }
}
