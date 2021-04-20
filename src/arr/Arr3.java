package arr;

import java.util.Scanner;

public class Arr3 {
    public static void main(String[] args) {
        int[]arr={1,5,6,8,4,76,55,44,88,10};
        for (int i=0;i<arr.length;i++)
        {
                for (int j=0;j<arr.length-i-1;j++)
                {
                    if (arr[j]<arr[j+1]){
                        int temp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        System.out.print("[");
        for (int p=0;p<arr.length;p++){
            if (p==arr.length-1){
                System.out.print(arr[p]);
            }else {
                System.out.print(arr[p]+",");
            }
        }
        System.out.println("]");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++)
            {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("[");
        for (int p=0;p<arr.length;p++){
            if (p==arr.length-1){
                System.out.print(arr[p]);
            }else {
                System.out.print(arr[p]+",");
            }
        }
        System.out.println("]");

        //求出四家店的手机最低价格

        Scanner input =new Scanner(System.in);
        System.out.println("输入四家店的价格");
        int min=0;
        int []arr2 =new int[4];
        for (int i=0;i<arr2.length;i++)
        {
            System.out.println("第"+(i+1)+"家店的价格");
            int in =input.nextInt();
            arr2[i]=in;
           if (i==0)  {
               min=arr2[i];
           }
           else if (min>arr2[i])
            {
                min=arr2[i]; }
        }
        System.out.println("最低价格是："+min);
    }
}
