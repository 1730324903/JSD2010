package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 利用反射调方法
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.sayHello();

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个类名：");
        String className = scan.nextLine();
        System.out.println("请输入方法名");
        String methodName = scan.nextLine();
        //1获取类对象
        //Class cls = Class.forName("reflect.Person");
        Class cls = Class.forName(className);
        //2实例化对象
        Object obj = cls.newInstance();
        //3获取对应方法
        //Method method = cls.getMethod("sayHello");
        Method method = cls.getMethod(methodName);
        //4调用该方法
        method.invoke(obj);//obj.sayHello()
    }
}
