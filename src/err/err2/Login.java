package err.err2;


import pe.Pe1;
import pe.Pe2;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Scanner;

public class Login {
    Scanner input =new Scanner(System.in);
    @NameAndPassWord(name = "qqq",passWord = "123456")
    public void login(){

            try {
            System.out.println("请输入用户名");
            String name = input.next();
            System.out.println("请输入密码");
            String password = input.next();
            Class<Login> loginClass = Login.class;

            ClassLoader classLoader = Login.class.getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("err/err2/login.properties");

            Properties properties = new Properties();
            properties.load(inputStream);

            String classNameValue = properties.getProperty("MethodName");

        
            Method login = loginClass.getMethod(classNameValue);
            NameAndPassWord annotation = login.getAnnotation(NameAndPassWord.class);

                if (name.equals(annotation.name()) && password.equals(annotation.passWord())) {

                    System.out.println("密码正确，欢迎来到德莱联盟");


                } else {
                    System.out.println("密码错误，请发送短信CZMM到10086重置密码");
                }
                System.out.println("注解上用户名是" + annotation.name() + "密码是" + annotation.passWord());

            } catch(NoSuchMethodException | IOException e){
                e.printStackTrace();
            }
        }


    public static void main(String[] args) {
        Login login=new Login();
        login.login();
    }

}
