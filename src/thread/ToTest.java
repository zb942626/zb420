package thread;

public class ToTest {
    public static void main(String[] args) {
        Tdo1 t1=new Tdo1("线程壹");
        t1.start();
        Tdo t2=new Tdo();
        Thread thread=new Thread(t2,"线程贰");
        thread.start();
    }
}
