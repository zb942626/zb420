package thread.run;

public class Run1000 {
    public static void main(String[] args) {
        Group1 p1 =new Group1();
        Group2 p2 =new Group2();
        p1.start();
        p2.start();

    }
}
