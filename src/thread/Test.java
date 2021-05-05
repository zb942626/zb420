package thread;

public class Test {
    public static void main(String[] args) {
        Tdo tdo =new Tdo();
        Thread t1 = new Thread( tdo,"线程1");
        t1.start();
    }
}
