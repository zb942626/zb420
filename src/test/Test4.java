package test;


import java.util.*;

public class Test4 {
    public Test4(){

    }
    //待反查的Map数据成员
    private HashMap<String, ArrayList<String>> map=new HashMap<>();
    //构造方法
    public Test4(HashMap<String, ArrayList<String>> map){
        this.map=map;
    }
    //反查
    public List<Object> getKeys(ArrayList value){
        ArrayList<Object> keys=new ArrayList<>();
        for(Map.Entry<String, ArrayList<String>> entry:this.map.entrySet()){
            if(value.equals(entry.getValue())){
                keys.add(entry.getKey());
            }else{
                continue;
            }
        }
        return keys;
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> all = new HashMap<>();
        ArrayList<String> san = new ArrayList<>();
        san.add("刘备");
        san.add("曹操");
        all.put("三国演义",san);
        ArrayList<String> diao =new ArrayList<>();
        diao.add("郭靖");
        diao.add("黄蓉");
        all.put("射雕英雄传",diao);
        ArrayList<String> ji =new ArrayList<>();
        ji.add("张无忌");
        ji.add("赵敏");
        all.put("倚天屠龙记",ji);
        System.out.println("请输入名著的名称");
        Scanner input =new Scanner(System.in);
        String mingzhu= input.next();
        Boolean aBoolean=true;
        for (String s1:all.keySet()) {
            if (mingzhu.equals(s1)){
                System.out.println("名著存在");
                aBoolean=false;
            }
        }
        if (aBoolean){
            System.out.println("名著不存在");
        }

        System.out.println("请输入人物的名称");
        String renwu =input.next();
        Set<String> strings = all.keySet();
        for (String s2 :strings){
            ArrayList<String> list = all.get(s2);
            for ( String S3 :list){
                if (renwu.equals(S3)){
                    Test4 se=new Test4(all);
                    for(Object S4:se.getKeys(list)){
                        System.out.println(S4);
                    }

//                  if (list==san){
//                      System.out.println("三国演义");
//                  }
//                  else if (list==diao){
//                      System.out.println("射雕英雄传");
//                  }
//                  else if (list==ji){
//                      System.out.println("倚天屠龙记");
//                  }
                }
            }
        }



        for (String s :strings){
            ArrayList<String> list = all.get(s);
            System.out.println(s);
            for (int i=0;i<list.size();i++){
                System.out.println("\t"+list.get(i));
            }

        }

    }
}
