package tasks.classwork.day8;

import java.io.*;
import java.nio.Buffer;

public class MyReader {

    public void read() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public void write() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("new_file.txt"));
        writer.write("mama mila ramu");
        writer.close();
    }

    public void copyText(String fileFrom, String fileTo) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileFrom));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileTo));
        String line;
        while ((line = reader.readLine()) != null) {
            writer.append(line);
            writer.newLine();

        }
        reader.close();
        writer.close();

    }
}
