package thread.run;

public class Group2 extends Thread{
   String[]arr={"2组1号","2组2号","2组3号","2组4号"};
    public Group2(){

    }
    public Group2(String name){
        super(name);
    }

    @Override
    public void run() {
        long start =System.currentTimeMillis();
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
        System.out.println("二组共耗时"+(end-start)+"毫秒");
    }
}
