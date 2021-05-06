package arr;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s =input.next();
        HashMap<Character,Integer> hsMap=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            char key = s.charAt(i);
            Integer ig=hsMap.get(key);
            if (ig==null){

            }
        }
    }
}
