package arr;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        String[] a = {"♦","♣","♥","♠"};
        String[] b ={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String c ="大王";
        String d ="小王";
        for (String s :a){
            for (String s1 :b){
                arrayList.add(s+s1);
            }
        }

        arrayList.add(c);
        arrayList.add(d);

        Collections.shuffle(arrayList);
        ArrayList<String>one =new ArrayList<>();
        ArrayList<String>tow=new ArrayList<>();
        ArrayList<String>three =new ArrayList<>();
        ArrayList<String>none =new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            String poke =arrayList.get(i);
            if (i>=arrayList.size()-3){
                none.add(poke);
            }else if (i%3==0){
                one.add(poke);
            }else if (i%3==1){
                tow.add(poke);
            }else {
                three.add(poke);
            }

        }
        System.out.println(one);
        System.out.println(tow);
        System.out.println(three);
        System.out.println(none);
}
}
