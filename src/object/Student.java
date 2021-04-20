package object;
import java.util.Scanner;
public class Student {
    private int a = 0;
    String name;
    double age;
    String garde;
    String interest;
    double score;
    Scanner input =new Scanner(System.in);
    /*public void xin( )   {
        System.out.println("姓名："+name+"\n"+"年龄:"+age);
        System.out.println("年龄:"+age);
        System.out.println("就读于："+garde);



  Z }*/
    public String getName(){
        System.out.println("请输入学员姓名");
        name=input.next();
        return name;
    }

    public double getScore( ){
        System.out.println("请输入学员成绩");
        score=input.nextDouble();
        if (score<60){
            score+=2;
            System.out.println("学员成绩是："+score);
        }
        else {
            System.out.println("学员:"+name+"成绩是："+score);
        }
        return score;
    }
    public void getAll(Student st){
        if (st.score<60){
            st.score+=2;
            System.out.println("学员:"+st.name+"成绩"+st.score);
        }
        else {
            System.out.println("学员:"+st.name+"成绩是："+st.score);
        }


    }


}
