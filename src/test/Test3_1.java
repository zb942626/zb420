package test;

import err.Test;

public class Test3_1 implements Runnable {
    Test3 test3=new Test3();
    public Test3_1(){};
    public Test3_1(Test3 test3){
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
