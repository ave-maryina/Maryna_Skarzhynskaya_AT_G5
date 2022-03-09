package tasks.homework.day8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class InputOutput {

    public static void printNextMonth() throws ParseException {

        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        DateFormat dateFormat = new SimpleDateFormat("MMMM");
        DateFormat newDateFormat = new SimpleDateFormat("M");
        Date date = dateFormat.parse(month);
        int nextMonth = Integer.parseInt(newDateFormat.format(date)) + 1;
        Date newDate = newDateFormat.parse(Integer.toString(nextMonth));
        System.out.println(dateFormat.format(newDate));

    }

    public static void countPunctuationAndWords(String file) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        String text = "";
        int punctuationNumber = 0;
        int wordsNumber = 0;

        while ((line = reader.readLine()) != null) {
            text += " " + line;
        }
        reader.close();

        Matcher matcherPunctuation = Pattern.compile("[.,?!:;-]").matcher(text);
        Matcher matcherWords = Pattern.compile("\\w+").matcher(text);

        while (matcherPunctuation.find()) {
            punctuationNumber++;
        }

        while (matcherWords.find()) {
            wordsNumber++;
        }

        System.out.printf("There are %s words and %s punctuation marks in the text", wordsNumber, punctuationNumber);

    }
}
