package list.dog;

import java.util.Iterator;
import java.util.Set;

public class DogTest {
    public static void main(String[] args) {
        Set<Dog> set1= Dog.set;
        Iterator<Dog> dogIterator = set1.iterator();
        System.out.println("一共有"+set1.size()+"只狗");
        System.out.println("分别是：");
//        for (Dog d:set1) {
//            System.out.println(d.name+"  "+d.type);
//        }
        Dog dog;
        while (dogIterator.hasNext()){
            dog=dogIterator.next();
            System.out.println(dog.name+"   "+dog.type);

        }

    }
}
