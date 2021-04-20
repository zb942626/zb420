package phone;

public class PhoneTest {
    public static void main(String[] args) {
        OlderPhone E63 =new OlderPhone();
        System.out.println("一个型号为诺基亚E63的手机");
       E63.call();
       E63.text();
       System.out.println("一个型号为华为P40的手机");
       NewPhone P40 =new NewPhone();
       P40.music();
       P40.photo();
       P40.photoText();
       P40.videoCall();
       P40.playGame();
    }
}
