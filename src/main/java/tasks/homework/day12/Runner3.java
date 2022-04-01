package tasks.homework.day12;

import java.util.stream.IntStream;

public class Runner3 {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> IntStream.rangeClosed(1, 27).boxed().map(Mouse::new).forEach(mouse -> {
            if (mouse.numberOfMouse %2 != 0) {
                try {
                    mouse.peep();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }));
        Thread t2 = new Thread(() -> IntStream.rangeClosed(1, 27).boxed().map(Mouse::new).forEach(mouse -> {
            if (mouse.numberOfMouse %2 != 0) {
                try {
                    mouse.peep();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }));
        Thread t3 = new Thread(() -> IntStream.rangeClosed(1, 27).boxed().map(Mouse::new).forEach(mouse -> {
            if (mouse.numberOfMouse %2 != 0) {
                try {
                    mouse.peep();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }));
        Thread t4 = new Thread(() -> IntStream.rangeClosed(1, 27).boxed().map(Mouse::new).forEach(mouse -> {
            if (mouse.numberOfMouse %2 != 0) {
                try {
                    mouse.peep();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }));
        Thread t5 = new Thread(() -> IntStream.rangeClosed(1, 27).boxed().map(Mouse::new).forEach(mouse -> {
            if (mouse.numberOfMouse %2 != 0) {
                try {
                    mouse.peep();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }));
        Thread t6 = new Thread(() -> IntStream.rangeClosed(1, 27).boxed().map(Mouse::new).forEach(mouse -> {
            if (mouse.numberOfMouse %2 != 0) {
                try {
                    mouse.peep();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
