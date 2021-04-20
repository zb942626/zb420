package petadministration;

public class Master {
    public static void main(String[] args) {
        Pet a =new Cat();
        Eat eat=new Eat();
        a.setName("罗小黑");
        a.setBreed("黑猫");
        a.setSatiety(100);
        eat.feed(a);

        Pet b =new Dog();
        b.setName("小艾");
        b.setSatiety(99);
        b.setBreed("泰迪犬");
        eat.feed(b);
    }

}
