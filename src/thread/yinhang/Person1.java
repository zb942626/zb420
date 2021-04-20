package thread.yinhang;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Person1 implements Runnable {
    //柜台
    Bank bank = new Bank();

    public Person1() {
    }
    public Person1(Bank bank) {
        this.bank = bank;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (bank) {

                if (bank.money >= 100) {
                    bank.getMoney1(100);

                } else {

                    break;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}