package pe;

import people.Person;


import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
public class Pe2 {
    public static void main(String[] args) throws ClassNotFoundException, IOException, NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        ClassLoader classLoader = Pe2.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("pe/per.properties");
        Properties properties = new Properties();

        Pe1 [] arrys=new Pe1[4];
        Pe1.genData(arrys);

         properties.load(inputStream);
        String classNameValue = properties.getProperty("className");

        Class cls =Class.forName(classNameValue);
        System.out.println("姓名   电话   性别  年龄");
        for (int i=0;i<arrys.length;i++){
            Object obj = arrys[i];
            Field[] fields = cls.getDeclaredFields();

            for (int j=0;j<fields.length;j++){
                Field file =fields[j];
                String person ="get"+ (file.getName().subSequence(0,1).toString().toUpperCase()+file.getName().substring(1));
                Method method = cls.getMethod(person);

                Object invoke = method.invoke(obj);
                System.out.print(invoke+"   ");

            }
            System.out.println("");

//            Field setName = cls.getDeclaredField(name);
//            Field setSex = cls.getDeclaredField(sex);
//            Field setPhone = cls.getDeclaredField(phone);
//            setName.set(obj1 ,"李彤");
//            setSex.set(obj1,"女");
//            setPhone.set(obj1,1554555221);
//
//            Method getName = cls.getMethod();
//            Object invoke = getName.invoke(obj1);
//            System.out.println(invoke);

//
//        ArrayList<Object> person= new ArrayList<>();
//        Class<? extends ArrayList> addPerson = person.getClass();
//        Method add = addPerson.getMethod("add", Object.class);
//        add.invoke(person,setName);
//        System.out.println(person);
    }
}
}
