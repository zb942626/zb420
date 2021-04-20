package object;

import java.util.Scanner;

public class Array {
    //循环输出数组的值
    public static void main(String[] args) {
        int []arr ={8,4,2,1,23,344,12};
        int sum=0 ;
        for (int i =0;i<arr.length;i++){
            sum +=arr[i];
            System.out.print("第"+(i+1)+"个数:"+arr[i]+" \n");

        }


        //猜数游戏
        int[] arr1={1,2,3,4,9,75,56,55} ;
        Scanner input =new Scanner(System.in);

            System.out.println("请输入一个数");
            int num =input.nextInt();
            for (int i=0;i<arr1.length;i++) {
                if (num == arr1[i]) {
                    System.out.println("数组包含这个数序号为：" + i);
                    break;
                }
                if (i==arr.length){
                System.out.println("不存在");
            }
            }
        //输出数组的总金额

        double [] arr3=new double[5];
        double num1 ;
        double sum1=0.0;
        Scanner input1 =new Scanner(System.in);
        System.out.println("请输入会员本月数据记录");
        for (int j=0 ;j<arr3.length;j++)
        {
            System.out.print("请输入第"+(j+1)+"个数据：");
            num1 = input1.nextDouble();
            arr3[j]=num1;
            sum1 +=arr3[j];
        }
        System.out.println("序号"+"\t\t"+"金额（元）");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println((i+1)+"\t\t"+arr3[i]);
        }
        System.out.println("总金额:"+"\t"+sum1);

    }
}
