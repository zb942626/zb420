package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("D:\\dev\\lt\\java.txt");
        FileOutputStream fos = new FileOutputStream("D:\\dev\\lt\\java1.txt");
        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }
        fos.close();
        fis.close();
    }
}
