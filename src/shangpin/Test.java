package shangpin;

public class Test {
    public static void main(String[] args) {
        Print print =new Print();
        Goods tv1=new Tvs();
        tv1.name="小米电视机";
        tv1.money=1500;
        Goods a= print.print(tv1);
        a.print();
        Goods food1= new Foods();
        food1.name="鸡蛋";
        food1.money=1;
        Goods b=  print.print(food1);
        b.print();


    }
}
