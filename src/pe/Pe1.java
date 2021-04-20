package pe;

public class Pe1 {
    String  name ;
    int  phone;
    String sex;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public  static  void  genData(Pe1[] pe1s){
        Pe1 p1=new Pe1();
        Pe1 p2=new Pe1();
        Pe1 p3=new Pe1();
        Pe1 p4=new Pe1();
        pe1s[0]=p1;
        pe1s[1]=p2;
        pe1s[2]=p3;
        
        pe1s[3]=p4;

        p1.name="李彤";p1.phone=1555;p1.sex="女";p1.age=100;
        p2.name="海菊";p2.phone=1666;p2.sex="女";p2.age=100;
        p3.name="滕丽";p3.phone=1777;p3.sex="女";p3.age=100;
        p4.name="新儒";p4.phone=1888;p4.sex="男";p4.age=100;
    }



}
