package test;

import object.Array;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) throws IOException {
        Scanner input =new Scanner(System.in);
        BufferedWriter fileWriter =new BufferedWriter(new FileWriter("D:\\stu.txt"));
        fileWriter.write("学生姓名"+"  ");
        fileWriter.write("语文"+"  ");
        fileWriter.write("数学"+"  ");
        fileWriter.write("英语"+"  ");
        fileWriter.write("平均分");
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i =0 ;i<3;i++){
            fileWriter.flush();
            fileWriter.newLine();
            System.out.println("请输入学生姓名");
            String one =input.next();
            fileWriter.write(one+"     ");
            System.out.println("请输入语文成绩");
            int one1 =input.nextInt();
            integers.add(one1);
            fileWriter.write(one1+"    ");
            System.out.println("请输入数学成绩");
            int one2 =input.nextInt();
            fileWriter.write(one2+"    ");
            integers.add(one2);
            System.out.println("请输入英语成绩");
            int one3 =input.nextInt();
            integers.add(one3);
            fileWriter.write(one3+"  ");
            int one4 =(one1+one2+one3)/3;
            integers.add(one4);
            fileWriter.write(one4+"  ");
        }
        fileWriter.flush();
        fileWriter.newLine();
        fileWriter.write("每门课的平均分");
        int oneClass = 0;
        int towClass =0;
        int threeClass=0;
        int four=0;
        for (int i=0;i<integers.size();i++){
            if (i % 4 == 1) {
            oneClass+=integers.get(i);
            }
            if (i % 4 == 2) {
                towClass+=integers.get(i);
            }
            if (i % 4 == 3) {
               threeClass+=integers.get(i);
            }
            if (i % 4 == 0) {
                four+=integers.get(i);
            }
        }
        fileWriter.write(oneClass/3+"");
        fileWriter.write(towClass/3+"");
        fileWriter.write(threeClass/3+"");
        fileWriter.write(four/3+"");

        fileWriter.close();

    }
}
