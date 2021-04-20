import java.util.Random;
import java.util.Scanner;

public class ChouJiang {
    public static void main(String[] args) {
        /*Scanner sc =new Scanner(System.in);
        System.out.println("请输入您的java分数!!!");
        int score =sc.nextInt();
        System.out.println("您的Java分数是:"+score);
        System.out.println("请输入您的音乐分数");
        int score2 =sc.nextInt();
        System.out.println("您的音乐分数是："+score2);
        if ((score>90&&score2>80)||(score==100&&score2>70)){
            System.out.println("您获得手机一个");
        }else {
            System.out.println("您啥也没有"); }*/


       /* Scanner input =new Scanner(System.in);
        System.out.println("请输入四位数会员卡号");
        int num = input.nextInt();
        int random=(int)(Math.random()*10);
        int zj =num%1000/100;
        if (zj ==random){
            System.out.println("恭喜会员"+num+"中奖");
        }
        else{
            System.out.println("很遗憾会员"+num+"没中奖");
        }*/
       /* Scanner input =new Scanner(System.in);
        int level=input.nextInt();
        switch (level){
            case 1:{
                System.out.println("1");
                break;
            }
            case 2:

            default:{
                System.out.println("啥也没有");
            }

        }*/
        Random as =new Random();
        int bs =as.nextInt(10);
        System.out.println(bs);
    int random=(int)(Math.random()*10+1);
    Scanner input =new Scanner(System.in);
    System.out.println("请输入1-10的数字");

    while (true){
        int a =input.nextInt();
        if (a>random){
            System.out.println("猜大了");

        }else if (a<random) {
            System.out.println("猜小了");

        }else {
            System.out.println("猜中了");
            System.out.println("是否继续y/n");

            String yes =input.next();
            if ("y".equals(yes)){
                System.out.println("请输入一个数字");

                continue;
            }else if ("n".equals(yes)){
                System.out.println("程序退出");
            break;
            }else {
                System.out.println("输入错误重新输入");
            }
        }

    }





    }
}