package bird;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test  {
    public static void main(String[] args) {
        SingSong singSong =new SingSong() {
            @Override
            public void changGe() {
                System.out.println("布谷鸟唱精忠报国");
            }
        };
        singSong.changGe();

        Cuckoo cuckoo =new Cuckoo(){
            public void changGe(){
                System.out.println("布谷鸟唱小苹果");
            }
            public void fly(){
                System.out.println("飞飞飞");
            }
        };
        cuckoo.changGe();
        cuckoo.fly();

    }
}
