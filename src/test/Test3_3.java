package test;

public class Test3_3 {
    public static void main(String[] args) {
        Test3 test3=new Test3();
        Test3_1 test3_1=new Test3_1( test3);
        Test3_2 test3_2=new Test3_2( test3);
        Thread t1 = new Thread(test3_1);
        Thread t2 =new Thread(test3_2);
        t1.start();
        t2.start();


    }
}
