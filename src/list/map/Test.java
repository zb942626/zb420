package list.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.name="长菏";
        student1.sex="女";
        Student student2=new Student();
        student2.name="海菊";
        student2.sex="女";
        Student student3=new Student();
        student3.name="李彤";
        student3.sex="女";
        Student student4=new Student();
        student4.name="新儒";
        student4.sex="男";
        Map<String,Student> map=new HashMap();
        map.put("somk",student1);
        map.put("jj",student2);
        map.put("tt",student3);
        map.put("rr",student4);
        System.out.println("请输入英文名");
        Scanner scanner=new Scanner(System.in);
        String name = scanner.next();

        System.out.println("英文名是"+name+"姓名："+map.get(name).name+"  性别："+map.get(name).sex);

    }
}
