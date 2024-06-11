package Laboratorki1;
import java.util.*;

public class lb2 {
    public static String determineFinalState(List<String> actions) {
        int likesCount = 0;
        int dislikesCount = 0;

        for (String action : actions) {
            if (action.equals("Like")) {
                likesCount++;
            } else if (action.equals("Dislike")) {
                dislikesCount++;
            }
        }

        return (likesCount > dislikesCount) ? "Like" : (dislikesCount > likesCount) ? "Dislike" : "Nothing";
    }

    public static void main(String[] args) {
        List<String> test1 = List.of("Dislike");
        System.out.println("Ввод: " + test1 + " ➞ Вывод: " + determineFinalState(test1));

        List<String> test2 = List.of("Like", "Like");
        System.out.println("Ввод: " + test2 + " ➞ Вывод: " + determineFinalState(test2));

        List<String> test3 = List.of("Dislike", "Like");
        System.out.println("Ввод: " + test3 + " ➞ Вывод: " + determineFinalState(test3));
    }
}
