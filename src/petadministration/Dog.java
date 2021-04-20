package petadministration;

public class Dog extends Pet {
    @Override
    public void eat() {
        System.out.println("喂了"+getBreed()+getName()+"饱食度加"+getSatiety());
    }

    public Dog() {

    }

    public Dog(String name, int satiety, String breed) {
        super(name, satiety, breed);
    }
}
