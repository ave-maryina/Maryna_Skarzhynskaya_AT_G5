package tasks.classwork.day11;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class MyThread1 {
    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 5; i++) {
//            new Thread(() -> {
//                heavyMethod();
//            }).start();
//        }
//
        Thread t1 = new Thread(MyThread1::heavyMethod);
        Thread t2 = new Thread(MyThread1::heavyMethod);
        Thread t3 = new Thread(() -> heavyMethod());
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
    public static void heavyMethod() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 1_00_000_000; i++) {
            double d = tan(atan(123456789.123456789));
        }
        System.out.printf("I am %s and i have finished in %s mills \r\n", Thread.currentThread().getName(), (System.currentTimeMillis() - time));
    }
}
