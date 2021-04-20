package family;


public class Student {
    String name;
    int id;
    int age;
    int classId;

    public boolean xiangDeng(Student student)
    {
        if (classId == student.classId && name.equals(student.name)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.id = 1;
        student1.age =1;
        student1.name = "1";
        student1.classId=1;
        Student student2 = new Student();
        student2.id = 1;
        student2.age=1;
        student2.classId=1;
        student2.name = "1";

        System.out.println(student1.xiangDeng(student2));

    }
}
