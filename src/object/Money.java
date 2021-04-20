package object;

public class Money {
    public  Money(){

    }
    private double money =0.0;
    private int date=0;

    public void setDate(int date) {
        this.date = date;

    }

    public int getDate() {
        return date;
    }



    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
       this.money=money*200;



    }
}
