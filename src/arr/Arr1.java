package arr;

import java.util.Scanner;

public class Arr1 {
    public static void main(String[] args) {
       /* Scanner input =new Scanner(System.in);
        double []score =new double[5];
        double max =0.0;

        for ( int i=0;i<score.length;i++)
        {
            System.out.println("请输入第"+(i+1)+"个数");
            double in =input.nextDouble();
            score[i]=in;
            if (max<score[i]){
                max=score[i];
            }
        }
        System.out.println("最大数为："+max);
*/
        System.out.println("请输入一个数");
        int [] arr ={99,85,82,75,65};
        int [] arr1 =new int[6];
        Scanner input =new Scanner(System.in);
        int in =input.nextInt();
        int i=0;
        for (;i<arr.length;i++){
            if (arr[i]>in){
                arr1[i]=arr[i];
            }
            else {
                break;
            }
        }
        arr1[i]=in;
        for(;i< arr.length;i++ )
        {
            arr1[i+1]=arr[i];
    }
       /* for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]<arr[j+1]){
                    max =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=max;
                }
            }
        }*/

        for (int j=0;j<arr1.length;j++){
            System.out.println(arr1[j]);
        }




    }

}
