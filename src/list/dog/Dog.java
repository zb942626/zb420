package list.dog;

import java.util.HashSet;
import java.util.Set;

public class Dog {
    String name;
    String type;
    static Set <Dog>set=new HashSet();
    static {
        Dog dog1=new Dog();
        dog1.name="呵呵";
        dog1.type="拉布拉多";
        Dog dog2=new Dog();
        dog2.name="君君";
        dog2.type="泰迪";
        Dog dog3=new Dog();
        dog3.name="西西";
        dog3.type="阿拉斯加";
        Dog dog4=new Dog();
        dog4.name="彤彤";
        dog4.type="哈士奇";
        set.add(dog1);
        set.add(dog2);
        set.add(dog3);
        set.add(dog4);
    }
}
