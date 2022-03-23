package tasks.homework.day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            list.add(line);
        }
        reader.close();
        Arrays.stream(list.stream().skip(4).collect(Collectors.joining()).split("<br>")).map(x -> x.trim()).
                filter(x -> x.startsWith("Date log:")).map(x -> x.substring(0, 20) + " " + new Date()).forEach(System.out::println);
    }
}
