package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class b1168 {

    public static int calculateLEDs(String number) {
        int[] leds = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int totalLEDs = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            totalLEDs += leds[digit];
        }
        return totalLEDs;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String value = scanner.nextLine();
            int ledsNeeded = calculateLEDs(value);
            System.out.println(ledsNeeded + " leds");
        }
        scanner.close();
    }
}