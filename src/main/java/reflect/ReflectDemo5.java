package reflect;

import java.lang.reflect.Method;

/**
 * 调用有参方法
 */
public class ReflectDemo5 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.say("你好");

        //1获取类对象
        Class cls = Class.forName("reflect.Person");
        //2实例化
        Object obj = cls.newInstance();
        //3获取对应的方法
        Method method = cls.getMethod("say",String.class,int.class);
        //调用方法
        method.invoke(obj,"呵呵",3);
    }
}
