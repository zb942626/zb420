package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Dog {
    String name;
    String type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    static LinkedList<Dog> dogList = new LinkedList();
    static {
        Dog dog1= new Dog();
        dog1.name="彤彤";
        dog1.type="阿拉斯加";

        Dog dog2= new Dog();
        dog2.name="赫赫";
        dog2.type="拉布拉多";

        Dog dog3= new Dog();
        dog3.name="琳琳";
        dog3.type="雪纳瑞";

        Dog dog4= new Dog();
        dog4.name="君君";
        dog4.type="哈士奇";
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);


    }






}
