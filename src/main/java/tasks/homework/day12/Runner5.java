package tasks.homework.day12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Runner5 {

    static List<Mouse> mouses;

    public static void main(String[] args) {
        mouses = IntStream.rangeClosed(1, 381).boxed().map(Mouse::new).collect(Collectors.toList());
        Thread t1 = new Thread(() -> {
            try {
               removeOddMouse();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
               removeOddMouse();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t3 = new Thread(() -> {
            try {
                removeOddMouse();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t4 = new Thread(() -> {
            try {
                removeOddMouse();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t5 = new Thread(() -> {
            try {
                removeOddMouse();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t6 = new Thread(() -> {
            try {
                removeOddMouse();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t7 = new Thread(() -> {
            try {
                removeOddMouse();
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
        t7.start();
    }
    public static synchronized void removeOddMouse() throws InterruptedException {
        for (int i = 0; i < mouses.size(); i++) {
            Thread.sleep(250);
            if (mouses.get(i).numberOfMouse %2 != 0 ) {
                mouses.get(i).peep();
                mouses.remove(i);
            }
        }
    }
}
