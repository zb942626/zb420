package data;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Test1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(10000000);
        System.out.println(date1);
        //SimpleDateFormat simpleDateFormat=new SimpleDateFormat();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
}
