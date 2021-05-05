package IO;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        File file=new File("D:\\dev\\lt");
        getAllFies(file);
    }
    public static  void  getAllFies( File file){
        if (file!=null){
            File[] files = file.listFiles();
            for (File file1:files) {
                if (file1.isDirectory()){
                    getAllFies(file1);
                }else {
                    System.out.println(file1.getAbsolutePath());
                }
            }
        }
    }
}
