package reflect;

/**
 * 利用反射调用私有方法
 */
import java.lang.reflect.Method;

public class ReflectDemo6 {
    public static void main(String[] args) throws Exception {
        //Person p = new Person();
        //p.hehe();编译不通过，hehe()是一个私有方法
        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();
        Method method = cls.getDeclaredMethod("hehe");
        method.setAccessible(true);//强制反射
        method.invoke(obj);
    }
}
