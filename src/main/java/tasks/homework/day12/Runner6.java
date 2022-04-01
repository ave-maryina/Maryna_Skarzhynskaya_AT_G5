package tasks.homework.day12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Runner6 {

    static List<Mouse> mouses;

    public static void main(String[] args) {
        mouses = IntStream.rangeClosed(1, 421).boxed().map(Mouse::new).collect(Collectors.toList());
        Thread t1 = new Thread(() -> {
            try {
                removeEvenMouse();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                removeEvenMouse();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t3 = new Thread(() -> {
            try {
                removeEvenMouse();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t4 = new Thread(() -> {
            try {
                removeEvenMouse();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t5 = new Thread(() -> {
            try {
                removeEvenMouse();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t6 = new Thread(() -> {
            try {
                removeEvenMouse();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }

    public static synchronized void removeEvenMouse() throws InterruptedException {
        for (int i = 1; i < mouses.size(); i++) {
            Thread.sleep(170);
            if (mouses.get(i).numberOfMouse %2 == 0) {
                mouses.get(i).peep();
                mouses.remove(i);
            }
        }
    }
}
