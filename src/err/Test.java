package err;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    @err1
    public int add(int a ,int b){
        return a+b;
    }
    @err1
    public int div (int a,int b){
        return a/b;
    }
    public int sub(int a ,int b){
        return a-b;
    }

    public static void main(String[] args)  {
        Class aClass= null;
        try {
            aClass = Class.forName("err.Test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Object o = null;
        try {
            o = aClass.newInstance();

            Method[] methods = aClass.getDeclaredMethods();
            int err = 0;
            int j = 0;
            String a =new String();
            a.hashCode();


            for (int i = 0; i < methods.length; i++) {
                j = 0;
                if (methods[i].getAnnotations().length > 0) {

                    try {
                        methods[i].invoke(o, 1, 0);
                        System.out.println(methods[i].getName() + "有" + methods[i].getAnnotations().length + "个注解" + "有" + j + "异常");
                    } catch (Exception e) {
                        String message = e.getCause().getMessage();
                        err++;
                        j++;
                        System.out.println(methods[i].getName() + "有" + methods[i].getAnnotations().length + "个注解" + "有" + j + "异常" + message);
                    }
                }
            }
            System.out.println("总共有" + err + "个异常");

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
