package tasks.homework.day2.cycletask;

public class CycleTaskRunner  {

    public static void main(String[] args) {

        TrainWhile trainWhile = new TrainWhile();
        trainWhile.output();

        TrainFor trainFor = new TrainFor();
        trainFor.output();

        ArrayActions arrayActions = new ArrayActions();
        int[] array = ArrayCreating.arrayCreating(7);
        arrayActions.output(array);
        arrayActions.reverseOutput(array);
        arrayActions.arraySorting(array);
        arrayActions.arrayMultiplication(array);



    }
}
