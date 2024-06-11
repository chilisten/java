package Laboratorki1;

public class lb8 {
    public static void main(String[] args) {
        String[] correctAnswers = {"A", "C", "B", "D", "A", "B", "C", "D", "A", "C",
                "B", "D", "A", "B", "C", "D", "A", "C", "B", "D"};

        String[] studentAnswers = {"A", "D", "B", "C", "A", "B", "D", "C", "A", "C",
                "B", "D", "A", "B", "C", "D", "A", "B", "C", "D"};

        int correctCount = 0;
        int incorrectCount = 0;

        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equals(studentAnswers[i])) {
                correctCount++;
            } else {
                incorrectCount++;
            }
        }

        System.out.println("Правильные ответы: " + correctCount);
        System.out.println("Неправильные ответы: " + incorrectCount);
    }
}
