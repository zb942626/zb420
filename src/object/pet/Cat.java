package object.pet;

public class Cat extends Pet{
    /*String food1 ="鱼";
    String food2 ="猫粮";
    String food3 ="鸡胸肉";
    String[]foods={"鱼","猫粮","鸡胸肉"};
    public void eat(String food){
        System.out.println(sex+name+"吃"+food);
    }*/
    String sex="母";
    public void print(){
        System.out.println("宠物自白：");
        System.out.println("我的名字叫" + name + "我的健康值是" + health + "我和主人的亲密度是" + love);
        System.out.println("我的性别是" + sex);
    }


}
