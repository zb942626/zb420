package abnormal;

import java.util.Scanner;

public class AgeTest {
    public static void main(String[] args) {
        System.out.println("请输入年龄");
        Scanner scanner=new Scanner(System.in);
        Age a =new Age();
        try {
            int age =scanner.nextInt();
            a.setAge(age);
        }catch (Exception e){
           // e.printStackTrace();
            System.err.println("输入错误");
            return;
        }
        System.out.println("年龄是："+a.age);
    }
}
