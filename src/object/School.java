package object;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {

        Teacher lw = new Teacher();
       /* xm.getName();
        xm.getScore();
        */
        /*Student dm = new Student();
        Student xm = new Student();
        Student st = new Student();
        xm.name = "qwe";
        xm.score = 54;
        dm.score = 60;
        dm.name = "dqOK";
        st.name = "sss";
        st.score = 55;
        xm.getAll(xm);
        dm.getAll(dm);
        st.getAll(st);*/
        Scanner input =new Scanner(System.in);
        int size =0;
        System.out.println("请选择输入多少个数");
        size =input.nextInt();
        int[] score = new int[size];
        double sum = 0;
        for (int i=0;i<score.length;i++){
            System.out.println("请输入第"+(i+1)+"数");
            double a =input.nextDouble();
            sum += a;
        }
        double av = sum / score.length;
        System.out.println(score.length + "位同学平均分是" + av);

     /*   for (int i = 0; i < score.length; i++) {
            sum += score[i];

        }
        double av = sum / score.length;
        System.out.println(score.length + "位同学平均分是" + av);*/
        double a []={1,2,3,4};
        double b =(a[0]+a[2]+a[3])/4;
        System.out.println(b);
    }
}

