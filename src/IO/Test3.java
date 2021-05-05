package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException {
        /*追加参数2 为true*/
        FileOutputStream fos=new FileOutputStream("D:\\dev\\lt\\java.txt",true);
        byte[]bytes={97,98,98,99,99,97};
        byte[] bytes1 = "abcd".getBytes();
        for (int i = 0; i <10 ; i++) {
            fos.write(bytes1);
            fos.write("\r\n".getBytes());

        }
        fos.close();
    }
}
