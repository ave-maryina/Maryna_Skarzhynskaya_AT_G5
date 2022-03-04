package tasks.homework.day4.string_task;

import java.text.ParseException;

public class StringTaskRunner {

    public static void main(String[] args) throws ParseException {

        String s = "Мама 10 мыла, раму - 5 мыла мама в 10 мыла 0.";
        String date = "22.00 07.09.2020";
        String[] logs = {
                "access_log.2020.09.07 212.168.101.6 denied",
                "access_log.2020.09.07 212.168.101.5 granted",
                "access_log.2020.09.07 212.168.101.6 denied",
                "access_log.2020.09.07 212.168.101.7 denied",
                "access_log.2020.09.07 212.168.101.7 granted"};
        StringTask stringTask = new StringTask();
        stringTask.printDuplicate(s);
        stringTask.printNumbers(s);
        stringTask.ipAddress(logs);
        stringTask.dateFormat(date);
    }
}
