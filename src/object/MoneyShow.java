package object;

public class MoneyShow {
    public static void main(String[] args) {
        System.out.println("日期"+"\t\t"+"金额(元）");
        Money atm =new Money();


        double all =0.0;
       for (int i=5;i<31;i+=5){
           atm.setDate(i);
           atm.setMoney(atm.getDate());
           all+= atm.getMoney();
           System.out.println("3月"+atm.getDate()+"号:"+"  "+ atm.getMoney());
       }
        System.out.println("3月总金额:"+all);

    }
}
