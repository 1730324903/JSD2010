package reflect;

import java.util.Scanner;

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Person p = new Person();
        System.out.println(p);

        //1获取类的对象
        //Class cls = Class.forName("reflect.Person");

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个类名：");
        String className = scan.nextLine();
        Class cls = Class.forName(className);
        //2实例化
        Object obj = cls.newInstance();//只能调用无参构造实例化
        System.out.println(obj);
    }
}
