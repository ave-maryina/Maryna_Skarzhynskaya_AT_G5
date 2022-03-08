package tasks.homework.day8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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

}
