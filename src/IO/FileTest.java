package IO;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\dev");
       // System.out.println(file);
        File file1 = new File("D:\\dev","java.txt");
       // System.out.println(file1);
        boolean newFile = file.createNewFile();
        //System.out.println(newFile);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        String[] list = file.list();
        for (String S:list) {
            System.out.print(S);
        }
        System.out.println();
        File[] files = file.listFiles();
        for (File f:files){
            if (f.isFile()) {
                System.out.print(f.getName());
            }
        }
    }
}
