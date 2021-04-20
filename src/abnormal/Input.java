package abnormal;

public class Input {
    public void err(int s ) throws Err {
        if (s<1||s>3){
            throw new Err();
        }
    }
}
