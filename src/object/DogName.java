package object;

import java.util.Scanner;

public class DogName {
    public static void main(String[] args) {
        Dog teddyDog = new Dog();
        Scanner input =new Scanner(System.in);
        System.out.println("欢迎进入小狗管理系统");
        System.out.println("请输入新增小狗姓名");
        String name =input.next();
        teddyDog.setName(name);
        System.out.println("请选择小狗的性别（1.公仔2.母妹）");
        String sex =input.next();
        teddyDog.setSex(sex);
        System.out.println("请选择小狗的年龄（1-20之间）");
        int age =input.nextInt();
        teddyDog.setAge(age);
        System.out.println("请输入小狗的健康值（1-100之间）");
        int health=input.nextInt();
        teddyDog.setHealth(health);
        System.out.println("小狗的基本信息：");
        System.out.print("宠物名字是："+teddyDog.getName()+" ");
        System.out.print("性别是："+teddyDog.getSex()+" ");
        System.out.print("年龄是："+teddyDog.getAge()+" ");
        System.out.print("健康值是："+teddyDog.getHealth()+" ");

    }
}