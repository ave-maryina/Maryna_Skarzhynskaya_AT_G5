package tasks.classwork.day11;

public class Runner {

    public static void main(String[] args) {
        DemoBlock b1 = new DemoBlock();
        DemoBlock b2 = new DemoBlock();

        b1.setX(1);
        b1.setY(2);

        b2.setX(3);
        b2.setY(4);
        System.out.println(b1.getX());
        System.out.println(b1.getY());
        System.out.println(b2.getX());
        System.out.println(b2.getY());

    }
}
