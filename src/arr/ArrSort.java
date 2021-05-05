package arr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrSort {
    String name;
    int age;
    public static void main(String[] args) {
        ArrSort arrSort1 =new ArrSort();
        ArrSort arrSort2 =new ArrSort();
        arrSort1.name="sss";
        arrSort1.age=17;
        arrSort2.name="qqq";
        arrSort2.age=16;

        ArrayList<ArrSort> arrayList=new ArrayList();
        arrayList.add(arrSort1);
        arrayList.add(arrSort2);
        Collections.sort(arrayList, new Comparator<ArrSort>() {
            @Override
            public int compare(ArrSort o1, ArrSort o2) {
                int i = o1.age - o2.age;
               return i==0?o1.name.compareTo(o2.name):i;
            }
        });
        for (ArrSort a:arrayList) {
            System.out.println(a.age+a.name);
        }
    }
}
