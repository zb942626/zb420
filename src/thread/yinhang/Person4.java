package thread.yinhang;

public class Person4 implements Runnable{
    Bank bank = new Bank();

    public  Person4() {
    }
    public  Person4(Bank bank) {
        this.bank = bank;
    }


    public void run() {
        while (true){
            synchronized (bank) {
                if (bank.money >= 400) {
                    bank.getMoney4(400);
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
