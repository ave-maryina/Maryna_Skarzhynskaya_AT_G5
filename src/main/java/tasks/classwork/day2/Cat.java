package tasks.classwork.day2;

public class Cat {
    public static void main(String[] args) {

        int i;
        for ( i = 23; i < 28; i++) {
            if (i % 13 == 0) {
                System.out.println("continue!");
                break;
            }

            System.out.println("i is : " + i);
        }

        System.out.println("number is : " + i );
    }
}
