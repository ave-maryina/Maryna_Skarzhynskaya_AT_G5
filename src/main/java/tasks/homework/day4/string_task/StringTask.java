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
}
