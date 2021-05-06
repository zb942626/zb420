package test;


public class Test1 {
    public static void main(String[] args) {
        int i = 0;
        while (i<=1000) {
            if (i % 2 == 1&&i%3==2&&i%4==3&&i%5==4&&i%6==5){
                System.out.println(i);
            }
            i+=7;

        }
    }
}