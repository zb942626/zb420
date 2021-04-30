package lambda;

import java.util.Objects;

public class Dog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 =new Dog();
        dog.name="ss";
        dog.age=11;
        dog1.name="ss";
        dog1.age=11;
        boolean equals = dog.equals(dog1);
        System.out.println(equals);
    }
    String name;
    int age;

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                Objects.equals(name, dog.name);
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
}
