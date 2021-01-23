package Integer;

/**
 * JDK1.5推出是推出了一个新的特性：自动拆装箱
 * 该特性是编译器认可得而非虚拟机，使得我们在编写源代码时可以直接在基本类型和对应包装类
 * 之间互相赋值而无需在做转换工作，但是编译器编译时会补充转换代码。
 */
public class Demo {
    public static void main(String[] args) {
        /*
        这里触发了自动拆箱特性，编译器会补充代码改为：
        int i = new Integer（123).intValue()；
         */
        int i = new Integer(123);
        /*
        触发自动装箱特性，编译器会将代码改为
        Integer in = Integer.valueOf();
         */
        Integer in = i;
        System.out.println(i);
    }
}
