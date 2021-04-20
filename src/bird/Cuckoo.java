package bird;
//布谷鸟
public class Cuckoo extends Bird implements SingSong{
    @Override
    void fly() {
        System.out.println("飞");
    }

    @Override
    void call() {
        System.out.println("叫");
    }


    @Override
    public void changGe() {
        System.out.println("唱歌");

    }
}
