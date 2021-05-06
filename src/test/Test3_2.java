package test;

public class Test3_2 implements Runnable {
    Test3 test3=new Test3();
    public Test3_2(){};
    public Test3_2(Test3 test3){
        this.test3=test3;
    };
    @Override
    public void run() {

        while (true) {
            synchronized (test3) {
                if (test3.i < 91) {

                    System.out.println((char) test3.i);
                    test3.i++;
                } else {
                    break;
                }
            }
        }
    }
}
