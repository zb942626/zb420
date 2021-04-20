package petadministration;

public class Cat extends Pet {
    public Cat() {
    }

    public Cat(String name, int satiety, String breed) {
        super(name, satiety, breed);
    }

    @Override
    public void eat() {
        System.out.println("喂了"+getBreed()+getName()+"饱食度加"+getSatiety());
    }
    public  void sleep(){

    }
}
