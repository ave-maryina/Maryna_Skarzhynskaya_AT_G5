package tasks.classwork.day10;

public class Runner {

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        //mc.justMethod((s) -> System.out.println(s));
        //mc.justMethod(System.out::println);
        X x = new X("Lala");
        mc.justMethod((s) -> x);
    }
}
