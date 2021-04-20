package thread.run;

public class Group1 extends Thread {
    String[]arr={"1组1号","1组2号","1组3号","1组4号"};
    public Group1(){

    }
    public Group1(String name){
        super(name);
    }

    @Override
    public void run() {
        long start=System.currentTimeMillis();
        for(int i=0;i<arr.length;i++) {
            if (i<arr.length-1) {
                System.out.println(arr[i]+"跑了250米");
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            } else if (i==arr.length-1) {
                System.out.println(arr[i]+"跑了250米到达终点");
            }
        }
        long end =System.currentTimeMillis();
        System.out.println("一组耗时:"+(end-start)+"毫秒");
    }
}
