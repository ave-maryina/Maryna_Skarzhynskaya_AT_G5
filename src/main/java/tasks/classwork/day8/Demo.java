package tasks.classwork.day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException, InterruptedException {

        String x = String.valueOf(123);
        x = String.join(":", "123", "123", "ftr");
        x = String.format("%s мама %s мыла %s", "раму", "чисто", "быстро");
        System.out.printf("%s мама %s мыла %s", "раму", "чисто", "быстро").println();
        System.out.println(x);

        BufferedWriter writer = new BufferedWriter(new FileWriter("new_file.txt"));
        writer.write("mama mila ramu");
        writer.close();
    }
}
