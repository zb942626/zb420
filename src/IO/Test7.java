package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test7 {
    public static void main(String[] args) throws IOException {
        Properties prop =new Properties();

        FileReader fr =new FileReader("D:\\dev\\lt\\test.txt");
        prop.setProperty("count","0");
        prop.load(fr);
        fr.close();
        String count = prop.getProperty("count");
        int i = Integer.parseInt(count);
        if (i>=3){
            System.out.println("游戏试玩结束");
        }else {
            i++;
            FileWriter fw =new FileWriter("D:\\dev\\lt\\test.txt");
            prop.setProperty("count",String.valueOf(i));
            prop.store(fw,null);
            fw.close();
        }

    }
}
