package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\dev\\lt\\java5.txt"));
        //int read = bis.read();
        byte[] by =new byte[1024];
        int len;
        while ((len =bis.read(by))!=-1){
            System.out.println(new String(by,0,len));
        }
        bis.close();
    }
}
