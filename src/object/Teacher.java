package object;

public class Teacher {
    String name ;
    int  teachingAge;
    String specialty;
    String course;
public void xin(){
    System.out.println(name);
    System.out.println("专业方向："+specialty);
    System.out.println("教授课程:"+course);
    System.out.println("教龄:"+teachingAge);
}
public static int max (int num1,int num2){
    int result;
    if (num1>num2)
    {
        result=num1;
    }
    else {
        result=num2;
    }

    System.out.println(result);
    return result;





}
}
