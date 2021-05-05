package IO;

public class DIgui {
    public static void main(String[] args) {
        int fc = fc(4);
        System.out.println(fc);
    }
    public static int fc(int i){
        if (i==1){
            return 1;
        }else {
            return i*fc(i-1);
        }
    }
}
