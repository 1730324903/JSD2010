package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * java 反射机制
 * 反射是一个动态机制，允许我们在程序运行期间在确定对象的实例化，方法和属性的操作
 * 反射可以提高代码的灵活度，但是也带来了更多的系统开销和较慢的运行效率，因此不应当过度依赖
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        Class类，称为类的类对象
        JVM内部每个被加载的类都有且只有一个Class的实例化与之对应，通过类对可以获取到
        其表示的类而定一切信息(类名，有哪些方法，属性，构造器等)。并对该类进行相关的操作，
        获取一个类的类对象有三种方式:
        1:类名.class
        例如:
        Class cls = String.class;
        Class cls = int.class;//基本类型只有这种获取方式

        2:Class.forName(String className)
        通过Class的静态方法forName可以获取一个类的类对象，参数为该类的完全限定名。
        即:包名.类名
        例如:
        Class cls = Class.forName("java.lang.String");

        3:使用类加载器ClassLoader
         */

        //获取String的类对象来了解String的相关信息
        //Class cls = String.class;
        /*
        java.long.String
        java.util.ArrayList
        java.util.HashMap
        java.io.FileOutputStream
        java.lang.Thread
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个类名");
        String className = scan.nextLine();
        Class cls = Class.forName(className);

        String name = cls.getName();
        System.out.println(name);
        name = cls.getSimpleName();
        System.out.println(name);

        /*
        获取该类所有的公开方法，包括从超类继承的方法
         */
        Method[] methods = cls.getMethods();
        for(Method method : methods){
            System.out.println(method.getName());
        }
    }
}
