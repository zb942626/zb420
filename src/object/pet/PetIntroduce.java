package object.pet;

public class PetIntroduce {
    public static void main(String[] args) {
        Dog teddyDog=new Dog();
        teddyDog.name="小艾";
        teddyDog.health="100";
        teddyDog.love=100;
        teddyDog.breed="泰迪犬";
        Cat xiaoHei=new Cat();
        xiaoHei.name="小黑";
        xiaoHei.health="100";
        xiaoHei.love=90;
        xiaoHei.sex="公";
        teddyDog.print();
        xiaoHei.print();



    }
}
