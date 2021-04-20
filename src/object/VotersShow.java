package object;

import jdk.nashorn.internal.objects.NativeJSON;

import java.util.Scanner;

public class VotersShow {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        for (Voters.mun=0;Voters.mun<10;Voters.mun++){
            System.out.println("输入选民的姓名");
            String name =input.next();
            System.out.println(name+"投票成功");
        }
        System.out.println("投票结束");
    }
}
