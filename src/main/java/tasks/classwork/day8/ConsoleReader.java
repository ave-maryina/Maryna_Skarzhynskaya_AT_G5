package tasks.classwork.day8;

import java.util.Locale;
import java.util.Scanner;

public class ConsoleReader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();

            if(incoming.equalsIgnoreCase("break")) {
                System.out.printf("Just got '%s' text", incoming).println();

            }
            if("break".equalsIgnoreCase(incoming)){
                System.out.printf("Just got '%s' text", incoming).println();

            }
        }
    }
}
