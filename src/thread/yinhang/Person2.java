package thread.yinhang;

public class Person2 implements Runnable {
   // ATM
   Bank bank = new Bank();

    public Person2() {
    }
    public Person2(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {

        while (true ){
            synchronized (bank) {
                if (bank.money >= 200) {
                    bank.getMoney2(200);
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

