package phone;

public class NewPhone extends Phone implements Function {
    @Override
    void call() {
        System.out.println("打电话");
    }

    @Override
    void text() {
        System.out.println("发信息");
    }

    @Override
    public void music() {
        System.out.println("播放音乐");
    }

    @Override
    public void photo() {
        System.out.println("拍照片");
    }

    @Override
    public void photoText() {
        System.out.println("发送照片信息");
    }

    @Override
    public void videoCall() {
        System.out.println("视频通话");
    }

    @Override
    public void playGame() {
        System.out.println("正在玩五子棋");
    }
}

