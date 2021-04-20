package abnormal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KeCheng {
    public static void main(String[] args) throws Err {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入1-3的课程代号");
       int in;
        try {
            in =input.nextInt();
            if (in ==1){
                System.out.println("数学");
            }else if (in ==2){
                System.out.println("语文");
            }else if (in==3){
                System.out.println("英语");
            }else {System.err.println("输入错误");}
        }catch (Exception exception){
            System.err.println("输入错误");

        }
        finally {
            System.out.println("欢迎提出建议");
        }


    }
}
