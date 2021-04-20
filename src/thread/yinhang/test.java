package thread.yinhang;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test {
    public static void main(String[] args) {
        Bank a=new Bank();
        Person1 p1 = new Person1(a);
        Person2 p2 =new Person2(a) ;
        Person3 p3=new Person3(a);
        Person4 p4 =new Person4(a);
        Thread t1 =new Thread(p1);
        Thread t2 =new Thread(p2);
//        Thread t3 =new Thread(p3);
//        Thread t4 =new Thread(p4);
//        ExecutorService executorService= Executors.newFixedThreadPool(2);
//        executorService.submit(t1);
//        executorService.submit(t2);
        t1.start();
        t2.start();
//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        t3.start();
//        t4.start();


    }



}
