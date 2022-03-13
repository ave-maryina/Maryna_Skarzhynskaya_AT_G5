package tasks.homework.day8;

import java.io.*;
import java.nio.charset.StandardCharsets;
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

    public static void printFilesNames(String path) throws IOException {

        File dir = new File(path);
        File[] files = dir.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
        }
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

    public static void createDirectoryFiles() throws IOException {
        String path = "C:\\Users\\Марина\\IdeaProjects\\untitled3\\directory1\\directory2\\directory3\\directory4";
        File file = new File(path);
        file.mkdirs();
        BufferedWriter writer = new BufferedWriter(new FileWriter(path + "\\file1.txt"));
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            writer.write(Integer.toString(random.nextInt(50)) + " ");
        }
        writer.close();
        BufferedWriter writer1 = new BufferedWriter(new FileWriter(path + "\\file2.txt"));
        for (int i = 0; i < 10; i++) {
            writer1.write(Integer.toString(random.nextInt(50)) + " ");
        }
        writer1.close();
    }
}
