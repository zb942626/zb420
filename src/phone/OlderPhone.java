package phone;

public class OlderPhone extends Phone {




    @Override
    public void text() {
        System.out.println("发送信息");
    }



    @Override
    void call() {
        System.out.println("打电话");
    }
}
