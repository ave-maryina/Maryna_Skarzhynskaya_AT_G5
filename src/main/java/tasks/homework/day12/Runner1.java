package tasks.homework.day12;

import java.util.stream.IntStream;

public class Runner1 {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> IntStream.range(1, 21).forEach(i -> {
            try {
                new Mouse(i).peep();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        Thread t2 = new Thread(() -> IntStream.range(1, 21).forEach(i -> {
            try {
                new Mouse(i).peep();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        Thread t3 = new Thread(() -> IntStream.range(1, 21).forEach(i -> {
            try {
                new Mouse(i).peep();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        Thread t4 = new Thread(() -> IntStream.range(1, 21).forEach(i -> {
            try {
                new Mouse(i).peep();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        Thread t5 = new Thread(() -> IntStream.range(1, 21).forEach(i -> {
            try {
                new Mouse(i).peep();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
