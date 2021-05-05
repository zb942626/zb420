package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\dev\\lt\\java.txt");
        fileOutputStream.write(98);
       /* fileOutputStream.write(57);
        fileOutputStream.write(56);*/
        fileOutputStream.close();
    }
}
