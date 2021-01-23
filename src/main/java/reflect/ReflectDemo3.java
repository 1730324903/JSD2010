package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射调用有参构造器实例化
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Person p = new Person();
        System.out.println(p);

        //1获取类对象
        Class cls = Class.forName("reflect.Person");
        //2通过类对象获取对应的构造器
        Constructor c = cls.getConstructor(String.class,int.class);
        //3通过构造器对象进行实例化
        Object o = c.newInstance("印度阿三",26);
        System.out.println(o);
    }
}
