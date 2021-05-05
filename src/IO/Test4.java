package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\dev\\lt\\java.txt");
        int by;
        while ((by=fis.read())!=-1) {
            System.out.print( (char) by);
        }
        fis.close();
    }
}
