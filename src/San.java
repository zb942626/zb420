import java.util.Scanner;

public class San {
    public static void main(String[] args) {
        /*System.out.println("早上好");
        Scanner sc =new Scanner(System.in);
        int a =  sc.nextInt();

        System.out.println(a);*/
       /* String name ="赵波";
        char sex ='男';
        int age =25;
        int time =5;
        String job ="java";
        String hobby = "篮球";
        System.out.println("姓名："+name);
        System.out.println("性别："+sex);
        System.out.println("年龄："+age);
        System.out.println("做了"+time+"项目");
        System.out.println("技术方向："+job);
        System.out.println("兴趣爱好："+hobby);*/
        /*Scanner input =new Scanner(System.in);
        System.out.println("请输入4位数会员卡号");
        int num =input.nextInt();
            System.out.println("会员卡号是:" + num);
*/ /*int num1 =5;
int num2 =2;
int a=num1%num2;
int b=num1/num2;
        System.out.println(a);
        System.out.println(b);
        num1++;
        num2--;
        System.out.println(num1);
        System.out.println(num2);*/
        /*Scanner input =new Scanner(System.in);
        System.out.println("请输入4位数会员卡号");

       int num =input.nextInt();
       String s = String.valueOf(num);
        if (s.length()==4){

            int a =num/1000;
            int b = num%1000/100;
            int c =num%100/10;
            int d = num%10/1;
            System.out.println("会员卡号是:" + num);
            System.out.println("千位数是："+a);
            System.out.println("百位数是："+b);
            System.out.println("十位数是："+c);
            System.out.println("个位数是："+d);
            int sum =a+b+c+d;
            System.out.println("会员卡号各个位数之和是："+sum);
        }
        else{
            System.out.println("请输入四位数"+s);
        }*/
/*

        Scanner input =new Scanner(System.in);
        System.out.println("请输入四位数会员号");
        int num =input.nextInt();

        int a =num/1000;
        int b = num%1000/100;
        int c =num%100/10;
        int d = num%10;
        System.out.println( num);
        System.out.println("千位数是："+a);
        System.out.println("百位数是："+b);
        System.out.println("十位数是："+c);
        System.out.println("个位数是："+d);
        int sum =a+b+c+d;
        System.out.println("会员卡号各个位数之和是："+sum);
        String G=sum>20?"恭喜中奖获得MP3" :"很遗憾没有中奖";
        System.out.println(G);
*/
/*
double a = (Math.random());
        System.out.println(a);*/
     /*   for (int i =1;i<=100;i++){
            System.out.println("打鸡血第"+i+"次");
        }*/
        /*int i =1;
        while(i<=100){
            System.out.println("打鸡血第"+i+"次");
            i++;
        }*/
      /*  int i = 1;
        do {
            System.out.println("打鸡血第" + i + "次");
            i++;
        }
        while (i <= 100);*/
        /*Scanner input =new Scanner(System.in);
        int num = input.nextInt();*/

        /*for (int h=1;h<=5;h++){

            for (int l=1;l<=5-h;l++){
                System.out.print(" ");
                }
            for (int l =1;l<=5;l++) {
                System.out.print("*");
                 }
            for (int l=1;l<=h-1;l++){
                System.out.print(" ");
            }
            System.out.println();
            }

        for (int h1=1;h1<=5;h1++){

            for (int l=1;l<=5-h1;l++){
                System.out.print(" ");
            }
            for (int l =1;l<=2*h1-1;l++) {
                System.out.print("*");
            }





            System.out.println();
        }*/

        /*for (int h =1;h<=9;h++){
            for (int j = 1; j <=h ; j++) {
                System.out.print(h+"*"+j+"="+(h*j));
                if (h*j>=10) {
                    System.out.print("  ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/
        int sum =0;
        for (int i =1;i<=10;i++){
            sum+=i;
            if (sum>20){
                System.out.println("大于20 的当前值："+i);
                break;
            }
        }
        int sum1 =0;
        for (int j=0;j<=10;j++){
            if (j%2==0){
                sum1+=j;
            }

        }
        System.out.println("1-10的偶数和:"+sum1);
    }
}