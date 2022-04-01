package tasks.classwork.day11;

public class DemoThread {

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 3; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("t1-%s ", i);
                }
            }
        }).start();
        Thread.sleep(1000);

        synchronized (lock) {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.printf("m-%s ", i);
            }
        }
    }
}
