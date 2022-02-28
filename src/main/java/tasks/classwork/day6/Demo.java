package tasks.classwork.day6;

public class Demo {
    public static void main(String[] args) {

        String x = "sdf@mail.ru";
        var s = x + "fff";
        //String y[] = x.split("" + "");
        //x = x.replaceAll("abc", "999" );
        //x = x.substring(4);
        //x.substring(2, 4);
        x = x.trim();
        boolean z = x.matches("[a-z]+@[a-z]+.[a-z]{2}");
        s = x.concat("s");

        StringBuilder sb = new StringBuilder();

        for(int d = 0; d < 1000000; d++) {
            sb.append("hhhj");
        }



        //System.out.println(x.contains("999"));

        System.out.println(sb);
        //System.out.println(x.equals("Abc"));
        //System.out.println(x.equalsIgnoreCase("ABc"));
    }
}
