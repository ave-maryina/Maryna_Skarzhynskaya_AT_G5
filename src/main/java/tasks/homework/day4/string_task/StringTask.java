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

    public void ipAddress(String[] logs) throws ParseException {

        boolean unique;
        int size = 0;
        for (int i = 0; i < logs.length; i++) {
            unique = true;
            for (int j = i - 1; j >= 0; j--) {
                if ((logs[i].substring(22, 35).equals(logs[j].substring(22, 35)))) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                size++;
            }
        }

        String[] ip = new String[size];
        int index = 0;
        for (int i = 0; i < logs.length; i++) {
            unique = true;
            for (int j = i - 1; j >= 0; j--) {
                if ((logs[i].substring(22, 35).equals(logs[j].substring(22, 35)))) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                ip[index] = logs[i].substring(22, 35);
                index++;
            }
        }

        for (int i = 0; i < ip.length; i++) {
            int deniedCount = 0;
            int grantedCount = 0 ;
            for (int j = 0; j < logs.length; j++) {
                if (ip[i].equals(logs[j].substring(22, 35))) {
                    if (logs[j].substring(36).equals("granted")) {
                        grantedCount++;
                    }
                    if (logs[j].substring(36).equals("denied")) {
                        deniedCount++;
                    }
                }
            }
            System.out.printf("ip %s: ok - %d, failed - %d", ip[i], grantedCount, deniedCount).println();
        }
    }

    public void dateFormat(String s) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("HH.mm dd.MM.yyyy");
        Date date = dateFormat.parse(s);
        DateFormat newDateFormat = new SimpleDateFormat("MMMM,d,yyyy HH:mm", Locale.ENGLISH);
        System.out.println(newDateFormat.format(date));
    }
}
