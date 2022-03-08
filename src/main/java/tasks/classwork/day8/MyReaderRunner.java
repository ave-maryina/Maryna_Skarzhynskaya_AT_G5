package tasks.classwork.day8;

import java.io.IOException;

public class MyReaderRunner {

    public static void main(String[] args) throws IOException {
        MyReader myReader = new MyReader();
        myReader.read();
        myReader.write();
        myReader.copyText("file.txt", "new_file.txt");
    }
}
