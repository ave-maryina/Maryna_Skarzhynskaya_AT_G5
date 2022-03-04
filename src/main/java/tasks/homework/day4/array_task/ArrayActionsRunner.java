package tasks.homework.day4.array_task;

import tasks.homework.day4.array_task.ArrayActions;

public class ArrayActionsRunner {

    public static void main(String[] args) {

        ArrayActions arrayActions = new ArrayActions();
        arrayActions.arraySum(2);
        for (int i :  arrayActions.getArray(3)) {
            System.out.println(i);
        }

        System.out.println(arrayActions.sum());
        arrayActions.draw();


    }
}
