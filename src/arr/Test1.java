package arr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        HashMap<String ,Integer> map=new HashMap<>();
        map.put("sss",10);
        map.put("sss",11);
        Set<String> strings = map.keySet();
        for (String s:strings) {
            System.out.println(s);
        }
        Integer sss = map.get("sss");
        System.out.println(sss);
    }

}

