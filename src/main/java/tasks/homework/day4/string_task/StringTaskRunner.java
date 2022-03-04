package tasks.homework.day4.string_task;

public class StringTaskRunner {

    public static void main(String[] args) {

        String s = "Мама 10 мыла, раму - 5 мыла мама в 10 мыла 0.";
        StringTask stringTask = new StringTask();
        stringTask.printDuplicate(s);
        stringTask.printNumbers(s);
    }
}
