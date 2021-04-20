package thread.yinhang;

public  class Bank {
    double money = 1000;

    public void getMoney1(int money) {
        this.money = this.money - money;
        System.out.println("1取走100还剩" + this.money);
    }

    public void getMoney2(int money) {
        this.money = this.money - money;
        System.out.println("2取走200还剩" + this.money);

    }

    public void getMoney3(int money) {
        this.money = this.money - money;
        System.out.println("3取走300还剩" + this.money);


    }

    public void getMoney4(int money) {
        this.money = this.money - money;
        System.out.println("4取走400还剩" + this.money);
    }

}


//    public  void getMoney2(int money){
//        this.money-=money;
//}

//    public void run() {
//        while (true) {
//            synchronized (o) {
//                if (i % 2 == 0) {
//                    money -= 200;
//                    System.out.println("ATM取走200还剩" + money);
//                    i++;
//                } else if (i % 2 != 1) {
//                    money -= 100;
//                    System.out.println("柜台取走100还剩" + money);
//                    i++;
//                } else if (money==0){
//                    break;
//                }
//            }
//        }
//    }

