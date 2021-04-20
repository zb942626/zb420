package thread;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ThreadTest1 {


    public static void main(String[] args) {
     /*   Thread1 thread1=new Thread1();
        Thread t1 =new Thread(thread1);
        Thread t2 =new Thread(thread1);

        t2.start();
        t1.start();*/
        Thread2 s2 = new Thread2();
        Thread2 s1 = new Thread2();
        s2.start();
        s1.start();
        for (int i =0;i<100;i++){
            System.out.println(i);
        }

    }

}
