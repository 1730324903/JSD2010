package Integer;

/**
 * 包装类
 * java为了解决基本类型不能直接参与面向对象开发而为他们提供了对应的引用类型，称为包装类
 * 并且8个包装类都所处在java.long包中
 * 包装类就是以“对象”的形式表示基本类型数据
 */
public class Demo1 {
    public static void main(String[] args) {
        int d = 123;
        //Integer i1 = new Integer(d);
        //Integer i2 = new Integer(d);
        /*
        java推荐使用包装类的静态方法valueOf创建包装类。
        Integer在使用valueOf形式创建时会重用-128-127之间的整数对象，减少内存开销
         */
        Integer i1 = Integer.valueOf(d);
        Integer i2 = Integer.valueOf(d);
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));

        double dou = 123.456;
        Double d1 = Double.valueOf(dou);
        Double d2 = Double.valueOf(dou);
        System.out.println(d1==d2);
        System.out.println(d1.equals(d2));

        int num = i1.intValue();
        double douNum = i1.intValue();
        System.out.println(num);
        System.out.println(douNum);

    }
}
