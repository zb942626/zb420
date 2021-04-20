package object.pet;


public class Dog extends Pet {
    /*String food1 ="骨头";
    String food2 ="狗粮";
    String[]foods={"骨头","狗粮"};*/
    String breed ;

  /*  public void eat(String food) {
        System.out.println(name + sex + "吃" + food);
    }*/

    public void print() {
        System.out.println("宠物自白：");
        System.out.println("我的名字叫" + name + "我的健康值是" + health + "我和主人的亲密度是" + love);
        System.out.println("我是一只" + breed);
    }
}
