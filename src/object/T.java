package object;

import java.util.Scanner;

public class T {
    public static void main(String[] args) {
        /*for (int i=1;i<=100;i++){
            if (i%7!=0){
                System.out.println(i);
            }
        }*/
        int[]a={1,2,3,4,5};
        int[]b={1,2,3,4,5};
        T ab=new T();
        ab.compare(a,b);
    }
    public boolean compare(int[]a,int[]b){

        if (a.length!=b.length){
            System.out.println("数组不相同");
        }
        for (int i=0;i<a.length;i++){
            if (a[i]!=b[i]) {
                System.out.println("数组不相同");
            }

        }
        System.out.println("数组相同");
        return true;
    }
}
