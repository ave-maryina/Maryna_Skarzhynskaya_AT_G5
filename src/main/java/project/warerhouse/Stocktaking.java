package project.warerhouse;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public  class Stocktaking {

    private static final Path FILE = Paths.get("new_file.txt");

    private  Stocktaking() {

    }

    public static void registerBox(VesselBox box) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE.toString()));
        writer.write("#" + box.hashCode() + "#" + box.getName());
        writer.close();
    }
    public static void disposeBox(VesselBox box) {

    }
    public static void getInfo() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILE.toString()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
