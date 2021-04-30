package lambda;

public class Test {
    public static class Main {
        public static void main(String args[]) {
            String x = null;
            giveMeAString(x);
            System.out.println(x);
        }
        static void giveMeAString(String y)
        {
            y = "RUNOOB";
        }
    }
}
