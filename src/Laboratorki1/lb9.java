package Laboratorki1;
import java.util.ArrayList;
import java.util.List;

public class lb9 {
    public static void main(String[] args) {
        int[] hoursWorked = {8, 8, 8, 0, 8, 8, 8, 8, 0, 0, 8, 8, 8, 8, 8, 0, 8, 8, 8, 0};

        List<Integer> weeklyHours = calculateWeeklyHours(hoursWorked);
        double averageDailyHours = calculateAverageDailyHours(hoursWorked);

        System.out.println("Часы работы по неделям:");
        for (int i = 0; i < weeklyHours.size(); i++) {
            System.out.println("Неделя " + (i + 1) + ": " + weeklyHours.get(i));
        }
        System.out.println("Среднее количество часов в день (учитывая только рабочие дни): " + averageDailyHours);
    }

    private static List<Integer> calculateWeeklyHours(int[] hoursWorked) {
        List<Integer> weeklyHours = new ArrayList<>();
        int totalHours = 0;
        int daysWorked = 0;
        for (int i = 0; i < hoursWorked.length; i++) {
            totalHours += hoursWorked[i];
            daysWorked++;
            if (daysWorked == 5 || i == hoursWorked.length - 1) {
                weeklyHours.add(totalHours);
                totalHours = 0;
                daysWorked = 0;
            }
        }

        return weeklyHours;
    }

    private static double calculateAverageDailyHours(int[] hoursWorked) {
        int totalHours = 0;
        int daysWorked = 0;

        for (int hours : hoursWorked) {
            if (hours > 0) {
                totalHours += hours;
                daysWorked++;
            }
        }

        if (daysWorked > 0) {
            return (double) totalHours / daysWorked;
        } else {
            return 0;
        }
    }
}
