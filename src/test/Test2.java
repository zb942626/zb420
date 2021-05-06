package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String s =input.next();
        System.out.println("请输入一段字符");
        System.out.println("一共有"+s.length()+"个字符");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i==s.length()-1){
                System.out.print(c);
            }else {
                System.out.print(c+",");
            }

        }
    }
}
