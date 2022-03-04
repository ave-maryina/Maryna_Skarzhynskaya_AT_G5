package tasks.homework.day4.string_task;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTask {

    public void printDuplicate(String s) {

        String[] words = s.toLowerCase(Locale.ROOT).split("(?U)[\\d\\W]+");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    System.out.println(words[j]);
                    break;
                }
            }
        }
    }

    public void printNumbers(String s) {

        Matcher matcher = Pattern.compile("\\d+").matcher(s);
        int size = 0;
        while (matcher.find()) {
            size++;
        }
        matcher.reset();
        int[] numbers = new int[size];
        int index = 0;
        while (matcher.find()) {
            numbers[index] = Integer.parseInt(matcher.group());
            System.out.println(numbers[index]);
            index++;
        }
    }
}
