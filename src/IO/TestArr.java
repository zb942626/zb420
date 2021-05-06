package IO;

import java.io.*;
import java.util.ArrayList;

public class TestArr {
    public static void main(String[] args) throws IOException {
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("wwwwww");
        arrayList.add("qqqqqq");
        arrayList.add("qweqweq");
        arrayList.add("eqweqww");
        BufferedWriter bw =new BufferedWriter(new FileWriter("D:\\dev\\lt\\arr.txt"));

        for (int i = 0; i <arrayList.size() ; i++) {
            bw.write(arrayList.get(i));
            bw.newLine();
            bw.flush();
        }
        System.out.println(arrayList.size());
        bw.close();
        BufferedReader br =new BufferedReader(new FileReader("D:\\dev\\lt\\arr.txt"));
        ArrayList<String> arrayList1 = new ArrayList<>();
//        for (int i = 0; i <4 ; i++) {
//            System.out.println(br.readLine());
//        }
        String line;
        while ((line =br.readLine())!=null){
            
          arrayList1.add(line);
        }
//        for (String s:arrayList1) {
//            System.out.println(s);
//        }
        for (int i = 0; i <arrayList1.size() ; i++) {
            System.out.println(arrayList1.get(i));
        }
        System.out.println(arrayList1.size());
        br.close();
    }
}
