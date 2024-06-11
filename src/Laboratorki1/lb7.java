package Laboratorki1;

import java.util.Scanner;

public class lb7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст пользователя: ");
        int age = scanner.nextInt();

        if (age % 2 == 0) {
            System.out.print("Нечетные числа до " + age + ": ");
            for (int i = 1; i <= age; i += 2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.print("Четные числа до " + age + ": ");
            for (int i = 2; i <= age; i += 2) {
                System.out.print(i + " ");
            }
        }
    }
}
