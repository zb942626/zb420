package thread.yinhang;

public class Person3 implements Runnable{
    Bank bank = new Bank();

    public  Person3() {
    }
    public  Person3(Bank bank) {
        this.bank = bank;
    }


    public void run() {
        while (true){
            synchronized (bank) {
                if (bank.money >= 300) {
                    bank.getMoney3(300);
                } else {
                    break;
                }

            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
