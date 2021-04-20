package shangpin;

public  class Print  {
    public Goods print(Goods goods ){
       if (goods instanceof Tvs){
           goods.money= goods.money*0.8;
       }else if (goods instanceof Foods){
           goods.money= goods.money*0.9;
       }
       return goods;
    }
}
