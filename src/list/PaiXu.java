package list;

import java.util.Comparator;
import java.util.TreeSet;

public class PaiXu {
    public static void main(String[] args) {

       TreeSet<Dog> ts=new TreeSet<Dog>(new Comparator<Dog>() {
            @Override

            public int compare(Dog d1, Dog d2) {
                int num = d1.getAge()-d2.getAge();
                return num == 0 ? d1.getName().compareTo(d2.getName()) : num;
            }


        });
        Dog dog1 =new Dog();
        Dog dog2 =new Dog();
        dog1.name= "小艾";
        dog2.name ="小仙";
        dog1.age=12;
        dog2.age=12;
        ts.add(dog1);
        ts.add(dog2);
        for (Dog d:ts) {
            System.out.println(d.getName()+d.getAge());

        }
    }
}
