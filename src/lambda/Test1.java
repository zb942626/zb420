package lambda;

public  class Test1 {
    public static void main(String[] args) {
        Lambda1 l1=new Lambda1();
        Thread t1=new Thread(l1);
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程启动了");
            }
        });
        new Thread(()->{
            System.out.println("开始了");
        }).start();
        "ssss".equals(t1);

        t1.start();
        t2.start();
    }
}
