package object;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
public class Tourist {

   /* String money;

    public void men(){
        Scanner input =new Scanner(System.in);
        while (true) {
            System.out.println("请输入姓名：");
            String name=input.next();


            System.out.println("请输入年龄：");
            int age =input.nextInt();

            if (age <= 12) {
                money = "免费";
            } else if (age <= 20) {
                money = "门票40元";
            } else if ( age <= 50) {
                money = "门票80元";
            } else {
                money = "门票35元";
            }
            System.out.println(name+"的年龄是"+age+"门票价格是："+money)
            ;

            System.out.println("按n退出 按其他键继续");
            String exit = input.next();
            if ("n".equals(exit)) {
                break;

            }


        }
    }*/
    String name1 ="qwe";
    String miMa1 ="12345";
    String name2 ="qaz";
    String miMa2 ="123456";
    Scanner input =new Scanner(System.in);
    public void logIN(){
        System.out.println("请输入用户名");
        String inName=input.next();
        System.out.println("请输入密码");
        String inmiMA=input.next();
        if (name1.equals(inName) && miMa1.equals(inmiMA)){
            System.out.println("请输入新密码");
            miMa1 =input.next();
            System.out.println("管理员"+name1+"修改密码成功新密码为："+miMa1);
        }
        else if (name2.equals(inName)&&miMa2.equals(inmiMA)){
            System.out.println("请输入新密码");
            miMa2  =input.next();
            System.out.println("管理员"+name2+"修改密码成功新密码为："+miMa2);
        }
        else {
            System.out.println("用户名或密码错误没有权限更新管理员信息");
        }
    }
}
