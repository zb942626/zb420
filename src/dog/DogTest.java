package dog;


public class DogTest {
    public static void main(String[] args) {
         Dog.dogList.size();
        Dog dog=new Dog();

        System.out.println("一共有"+ Dog.dogList.size()+"只狗狗");
        System.out.println("分别是：");
       for (int i=0;i< Dog.dogList.size();i++){
            dog = Dog.dogList.get(i);
           System.out.println(dog.name+"    "+dog.type);
       }
       Dog.dogList.remove(0);
        Dog.dogList.remove(0);

        System.out.println("删除后还剩"+Dog.dogList.size()+"只狗狗");
        System.out.println("分别是：");
        for (int i=0;i< Dog.dogList.size();i++){
            dog = Dog.dogList.get(i);
            System.out.println(dog.name+"    "+dog.type);
        }
        Dog dog1=new Dog();
        dog1.name="小艾";
        dog1.type="泰迪";
        Dog.dogList.add(dog1);
        boolean b = Dog.dogList.contains(dog1);
        if (b){
            System.out.println("集合中包含"+dog1.name+"的信息");
        }else{
            System.out.println("集合中不包含"+dog1.name+"的信息");
        }


    }
}
