package abnormal;

public class Err extends Exception {
    public Err(){

    }
   public Err(String message){
       super(message);
   }
}
