package abnormal;

import java.util.Scanner;

public class Test {
    public static void main(String[] argsS) {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入被除数");
        int a ;
        try {
            a =input.nextInt();
        }catch (Exception ex){
          a=0 ;
            System.out.println("输入错误系统退出");
            System.exit(0);

        }

        System.out.println("请输入除数");
        int b ;
        try{
            b = input.nextInt();
        }catch (Exception ex){
            b=1;
            System.out.println("输入错误系统退出");
            System.exit(0);
        }
        double c =(double)a/b;
        System.out.println(c);
    }
}

