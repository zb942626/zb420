package abnormal;

public class Age {
    int age;
    public void setAge(int age) throws Exception {
       if (age>100||age<1){
           throw new Exception();
       }else {
           this.age=age;
       }
    }
}
