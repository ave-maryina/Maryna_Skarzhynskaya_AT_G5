package tasks.homework.day_9;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Bird {

    private static List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
    private static final String VOWELS = "уёеыаоэяию";

    public static boolean isVowel(char ch) {
        return VOWELS.indexOf(ch) >= 0;
    }

    public static int countBirdContainVowels(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.toLowerCase(Locale.ROOT).charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    public static void printInformation() {
        int counterWords = 0;
        for (String s : birds) {
            System.out.println("--" + s + "--");
            if (countBirdContainVowels(s) > 1) {
                counterWords++;
            }
        }
        System.out.println("Number of birds containing more than one vowel: " + counterWords);
        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println();
        birds.set(3, "Синица");
        for (String s : birds) {
            System.out.print(s + " ");
        }
    }
}
