package list.money;

import object.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        ArrayList<Person> arrayList=new ArrayList();
        int l = 0;
        int h=0;
        int c=0;
        int t=0;
        int r=0;
        int x=0;
        int max =0;

       for (int i=0;i<1000;i++){
            Person person =new Person();
           int num = (int) (Math.random()*Person.names.length);
           person.name=Person.names[num];
           int money = (int) (Math.random() * 1000);
           person.money=money;
           arrayList.add(i, person);

       }
       for (int i=0;i<1000;i++){
           if (arrayList.get(i).name.equals("李彤")){
               l++;

           }else if (arrayList.get(i).name.equals("长菏")){
               h++;
           }
           else if (arrayList.get(i).name.equals("海菊")){
               c++;
           }else if (arrayList.get(i).name.equals("腾琳")){
               t++;
           }else if (arrayList.get(i).name.equals("梁茹")){
               r++;
           }else if (arrayList.get(i).name.equals("新儒")){
               x++;
           }
       }
        int[]a={l,h,c,t,r,x};
        Arrays.sort(a);

       if (a[a.length-1]==l){
           System.out.println("李彤消费次数最多");
           for (int i=0;i<1000;i++){
               if (arrayList.get(i).name.equals("李彤")){
                   if (arrayList.get(i).money>max)
                   max=arrayList.get(i).money;
               }
           }
           System.out.println("最高消费是："+max);
       }
        if (a[a.length-1]==h){
            System.out.println("海菊消费次数最多");
            for (int i=0;i<1000;i++){
                if (arrayList.get(i).name.equals("海菊")){
                    if (arrayList.get(i).money>max)
                        max=arrayList.get(i).money;
                }
            }
            System.out.println("最高消费是："+max);
        }
        if (a[a.length-1]==c){
            System.out.println("长菏消费次数最多");
            for (int i=0;i<1000;i++){
                if (arrayList.get(i).name.equals("长菏")){
                    if (arrayList.get(i).money>max)
                        max=arrayList.get(i).money;
                }
            }
            System.out.println("最高消费是："+max);
        }
        if (a[a.length-1]==t){
            System.out.println("腾琳消费次数最多");
            for (int i=0;i<1000;i++){
                if (arrayList.get(i).name.equals("腾琳")){
                    if (arrayList.get(i).money>max)
                        max=arrayList.get(i).money;
                }
            }
            System.out.println("最高消费是："+max);
        }
        if (a[a.length-1]==r){
            System.out.println("梁茹消费次数最多");
            for (int i=0;i<1000;i++){
                if (arrayList.get(i).name.equals("梁茹")){
                    if (arrayList.get(i).money>max)
                        max=arrayList.get(i).money;
                }
            }
            System.out.println("最高消费是："+max);
        }
        if (a[a.length-1]==x){
            System.out.println("新儒消费次数最多");
            for (int i=0;i<1000;i++){
                if (arrayList.get(i).name.equals("新儒")){
                    if (arrayList.get(i).money>max)
                        max=arrayList.get(i).money;
                }
            }
            System.out.println("最高消费是："+max);
        }
    }
}

