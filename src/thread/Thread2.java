package thread;

import java.security.PublicKey;

public class Thread2 extends Thread{
    public Thread2(){}
    public Thread2(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println(getName()+":"+i);

        }
    }
}
